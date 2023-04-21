
package taskmanagementsystem;

import java.util.ArrayList;
import java.util.Date;

public class leader extends user {

    ArrayList<employee> emps = new ArrayList<>();
    ArrayList<task> tasks = new ArrayList<>();
    ArrayList<timecard> timecards = new ArrayList<>();
    
    timecard temp;

    // empty constructor
    public leader() {
        temp = new timecard();
    }

    // constructor
    public leader(String name, int id, int age, String username, String password) {
        super(name, id, age, username, password);
        temp = new timecard();
    }

    // add employee under the supervision of leader
    public void addEmp(employee e) {
        emps.add(e);
        e.empLeader = this;
    }

    // assign task to employee
   // leader can not call this function until employee accept the task
    public void addTaskEmp(employee e, task t) { 
        e.addTask(t);
        t.assigEmployee = e;
    }

    public void createMission(int taskid, employee e) {
        for (task t : tasks) {
            if (t.id == taskid) {
                Mission m = new Mission(t);
                e.missions.add(m);
            }
        }
    }

    // leader creating each task
    public void createTask(task t) {
        this.tasks.add(t);
        Date d = new Date();
        t.startDate = d;
    }

    // prints all tasks
    public void showAll() {
        for (task t : tasks) {
            System.out.println(t);
        }
    }

    // update and set evaluation of each task
    public void evaluateTask(int id, String evaluation) {
        for (task t : tasks) {
            if (t.id == id) {
                t.setEvaluation(evaluation);
            }
        }
    }

    // reassign task to another employee
    public void reassignTask(employee e1, employee e2, int id) {
        for (task t : tasks) {
            if (t.id == id) {
                e1.removeTask(t);
                e2.addTask(t);
            }
        }
    }

    // editing fields in task
    public void editTaskField(int id, String description, int code, String title) {
        for (task t : tasks) {
            if (t.id == id) {
                t.setDescription(description);
                t.setCode(code);
                t.setTitle(title);
            }
        }
    }

    // employee finished the task afeter the revision
    public void endTask(int idemp, int idtask) {
        for (employee e : emps) {
            if (e.id == idemp) {
                for (task t : tasks) {
                    if (t.id == idtask) {
                        e.removeTask(t);
                        Date d = new Date();
                        t.endDate = d;
                    }
                }
            }
        }
    }

    // addentance of the leader
    public void attended() {
        Date d = new Date();
        temp.arrivalTime = d;
    }

    // departure of leader
    public void departure() {
        Date d = new Date();
        temp.departureTime = d;
        timecards.add(temp);
    }

}
