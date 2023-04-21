
package taskmanagementsystem;

import java.util.*;

public class admin extends user {

    ArrayList<employee> emps = new ArrayList<>();
    ArrayList<leader> leaders = new ArrayList<>();
    ArrayList<project> projects = new ArrayList<>();
    
    public admin (){

    }
    public admin(String name, int id, int age, String username, String password) {
        super(name, id, age, username, password);
    }

    // add a new employee
    public void addEmp(employee e) {
        emps.add(e);
    }

    // add new leader
    public void addLeader(leader l) {
        leaders.add(l);
    }

    // add a project
    public void addProject(project p) {
        projects.add(p);
    }

    // add phase to the task
    public boolean addTaskPhase(int taskid, int projectid, String phase) {
        for (project p : projects) {
            if (p.id == projectid) {
                for (task t : p.tasks) {
                    if (t.id == taskid) {
                        t.addPhase(phase);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // delete a phase from a task
    public boolean deleteTaskPhase(int taskid, int projectid, String phase) {
        for (project p : projects) {
            if (p.id == projectid) {
                for (task t : p.tasks) {
                    if (t.id == taskid) {
                        boolean done = false;
                        done = t.deletePhase(phase);
                        if (done) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // delete an employee from the system
    public boolean deleteEmp(int id) {

        for (employee employee : emps) {
            if (employee.id == id) {
                emps.remove(employee);
                return true;
            }
        }
        return false;
    }

    // delete a leader from the system
    public boolean deleteLeader(int id) {

        for (leader leader : leaders) {
            if (leader.id == id) {
                leaders.remove(leader);
                return true;
            }
        }
        return false;
    }

    // delete a project from the system
    public boolean deleteProject(int id) {

        for (project p : projects) {
            if (p.id == id) {
                projects.remove(p);
                return true;
            }
        }
        return false;
    }

    // adding leader to each project
    public void assignLeaderToProject(project p, leader l) {
        p.addLeader(l);
    }

    // adding employee to each leader
    public void assignEmployeeToLeader(leader l, employee e) {
        l.addEmp(e);
    }

    // update phase in a task
    public boolean updateTaskPhase(int projectid, int taskid, String oldPhase, String newPhase) {

        for (project p : projects) {
            if (p.id == projectid) {
                for (task t : p.tasks) {
                    if (t.id == taskid) {
                        boolean done = false;
                        done = t.updatePhase(oldPhase, newPhase);
                        if (done) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // update username in an employee
    public boolean updateEmpUsername(int id, String u) {

        for (employee employee : emps) {
            if (employee.id == id) {
                employee.username = u;
                return true;
            }
        }
        return false;
    }

    // update leader in an leader
    public boolean updateLeaderUsername(int id, String u) {

        for (leader leader : leaders) {
            if (leader.id == id) {
                leader.username = u;
                return true;
            }
        }
        return false;
    }

    // update name in an employee
    public boolean updateEmpName(int id, String n) {

        for (employee employee : emps) {
            if (employee.id == id) {
                employee.name = n;
                return true;
            }
        }
        return false;
    }

    // update name in an leader
    public boolean updateLeaderName(int id, String n) {

        for (leader leader : leaders) {
            if (leader.id == id) {
                leader.name = n;
                return true;
            }
        }
        return false;
    }

    // update age in an employee
    public boolean updateEmpAge(int id, int a) {

        for (employee employee : emps) {
            if (employee.id == id) {
                employee.age = a;
                return true;
            }
        }
        return false;
    }

    // update age in an leader
    public boolean updateLeaderAge(int id, int a) {

        for (leader leader : leaders) {
            if (leader.id == id) {
                leader.age = a;
                return true;
            }
        }
        return false;
    }

    // promotion of employee to be a leader (update employee type)
    public void updateEmpToLeader(int id) {
        employee tempe = new employee();
        for (employee e : emps) {
            if (e.id == id) {
                tempe = e;
            }
            leader templ = new leader(tempe.name, tempe.id, tempe.age, tempe.username, tempe.password);
            leaders.add(templ);
            this.deleteEmp(id);
        }
    }

    // demotion of leader to be an employee (update leader type)
    public void updateLeaderToEmp(int id) {

        leader tempL = new leader();
        for (leader l : leaders) {
            if (l.id == id) {
                tempL = l;
            }
            employee tempe = new employee(tempL.name, tempL.id, tempL.age, tempL.username, tempL.password);
            emps.add(tempe);
            this.deleteLeader(id);
        }
    }

    // login as employee
    public boolean loginEmp(String u, String pass) {
        for (employee employee : emps) {
            if (employee.username.equalsIgnoreCase(u) && employee.password.equals(pass)) {
                return true;
            }
        }
        return false;
    }

    // login as leader
    public boolean loginLeader(String u, String pass) {
        for (leader leader : leaders) {
            if (leader.username.equalsIgnoreCase(u) && leader.password.equals(pass)) {
                return true;
            }
        }
        return false;
    }

    // logout
    public void logout(boolean b) {
        b = false;
    }

}
