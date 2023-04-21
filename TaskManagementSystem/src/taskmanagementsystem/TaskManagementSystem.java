package taskmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementSystem {

    // board for the leave requests
    public static ArrayList<Leave> leaves = new ArrayList<>();

    public static void main(String[] args) {

        admin a = new admin("mariam", 1, 20, "mariam55", "123"); // admin

        leader l1 = new leader("l1", 40, 41, "leader1", "123"); // leader 1
        leader l2 = new leader("l2", 41, 43, "leader2", "456");
        leader l3 = new leader("l3", 42, 42, "leader3", "789");
        leader l4 = new leader("l4", 43, 45, "leader4", "910");

        project p1 = new project(100);
        project p2 = new project(101);

        employee e1 = new employee("e1", 20, 41, "employee1", "123"); // employee 1
        employee e2 = new employee("e2", 21, 42, "employee2", "456"); // employee 2
        employee e3 = new employee("e3", 22, 43, "employee3", "789");
        employee e4 = new employee("e4", 23, 44, "employee4", "910");
        employee e5 = new employee("e5", 24, 44, "employee5", "112");
        employee e6 = new employee("e6", 25, 44, "employee6", "131");
        employee e7 = new employee("e7", 26, 44, "employee7", "141");
        employee e8 = new employee("e8", 27, 44, "employee8", "151");

        a.addEmp(e1);
        a.addEmp(e2);
        a.addEmp(e3);
        a.addEmp(e4);
        a.addEmp(e5);
        a.addEmp(e6);
        a.addEmp(e7);
        a.addEmp(e8);

        a.addLeader(l1);
        a.addLeader(l2);
        a.addLeader(l3);
        a.addLeader(l4);

        a.addProject(p1);
        a.addProject(p2);

        a.assignLeaderToProject(p1, l1);
        a.assignLeaderToProject(p1, l2);

        a.assignLeaderToProject(p2, l3);
        a.assignLeaderToProject(p2, l4);

        a.assignEmployeeToLeader(l1, e1);
        a.assignEmployeeToLeader(l1, e2);

        a.assignEmployeeToLeader(l2, e3);
        a.assignEmployeeToLeader(l2, e4);

        a.assignEmployeeToLeader(l3, e5);
        a.assignEmployeeToLeader(l3, e6);

        a.assignEmployeeToLeader(l4, e7);
        a.assignEmployeeToLeader(l4, e8);

        l1.addEmp(e1);
        l1.addEmp(e2);

        task t1 = new task(1);
        t1.setDescription("this is a task where you complete search for a product");
        t1.setTitle("complete search");

        task t2 = new task(2);
        t2.setDescription("this is an advance task for the complete seach where you use a dynamic array");
        t2.setTitle("Dynamic programming");

        l1.createTask(t1);
        l1.createTask(t2);

        l1.createMission(1, e1);
        l1.createMission(2, e2);

        // e1.showMissions();
        // e2.showMissions();

        // employee adds leave request
        String leaverequest;
        leaverequest = "sick";
        Leave temp = new Leave(e1.id, leaverequest);
        leaves.add(temp);

        Scanner input = new Scanner(System.in);

        int menu = 0;

        while (menu != 3) {
            System.out.println("1. use GUI \n2. use Terminal\n3. exit");
            menu = input.nextInt();
            if (menu == 1) {

                while (menu != 3) {
                    System.out.println("1.  Login In as Employee , Leader \n2.  Log In as Admin\n3.  exit");
                    menu = input.nextInt();
                    switch (menu) {
                        case 1:
                            LogInGui l = new LogInGui();
                            l.setVisible(true);
                            break;
                        case 2:
                            AdminGui admin = new AdminGui();
                            admin.setVisible(true);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid choice , please try again !!");
                            break;
                    }
                }
            } else if (menu == 2) {
                menu = 0;
                while (menu != 4) {
                    System.out.println("1. login as admin\n2. login as leader\n3. login as employee\n4. exit");
                    menu = input.nextInt();
                    if (menu == 1) { // start admin
                        System.out.println("enter admin's username and password");
                        String username = input.next();
                        String password = input.next();
                        while (!username.equals(a.username) && !password.equals(a.password)) {
                            System.out.println("invalid credentials");
                            System.out.println("enter username and password");
                            username = input.next();
                            password = input.next();
                        }
                        System.out.println("login successfully");
                        do {
                            System.out.println(
                                    "1.  add leader\n2.  add employee\n3.  add project\n4.  add TaskPhase\n5.  delete employee"
                                            + "\n6.  delete leader\n7.  delete project\n8.  delete taskphase\n9.  update TaskPhase\n10. update employee ueser name"
                                            + "\n11. update employee name\n12. update employee age\n13. update leader user name\n14. update leader name"
                                            +
                                            "\n15. update leader age\n16. update employee to be a leader\n17. update a leader to be a employee\n18. assign employee to leader"
                                            +
                                            "\n19. assign leader to project\n20. employee log in\n21. leader log in\n22. Exit \n");
                            menu = input.nextInt();

                            switch (menu) {
                                case 1: {
                                    // add leader case
                                    System.out.println("Please enter leader's name, id, age, username, password : ");
                                    String name = input.next();
                                    int id = input.nextInt();
                                    int age = input.nextInt();
                                    username = input.next();
                                    password = input.next();
                                    leader templ = new leader(name, id, age, username, password);
                                    a.addLeader(templ);
                                    break;
                                }
                                case 2: {
                                    // add employee case
                                    System.out.println("Please enter employee's name, id, age, username, password : ");
                                    String name = input.next();
                                    int id = input.nextInt();
                                    int age = input.nextInt();
                                    username = input.next();
                                    password = input.next();
                                    employee tempe = new employee(name, id, age, username, password);
                                    a.addEmp(tempe);
                                    break;
                                }
                                case 3: {
                                    // add project case
                                    System.out.println("Please enter project ID : ");
                                    int id = input.nextInt();
                                    project temp1 = new project(id);
                                    a.addProject(temp1);
                                    break;
                                }
                                case 4: {
                                    // add task phase
                                    System.out.println("Please enter project id, task id, Taskphase : ");
                                    int Projectid = input.nextInt();
                                    int Taskid = input.nextInt();
                                    String Taskphase = input.next();
                                    a.addTaskPhase(Taskid, Projectid, Taskphase);
                                    break;
                                }
                                case 5:
                                    // delete employee
                                    System.out.println("Please enter employee id : ");
                                    int empid = input.nextInt();
                                    a.deleteEmp(empid);
                                    break;
                                case 6:
                                    // delete leader
                                    System.out.println("Please enter leader id : ");
                                    int leaderid = input.nextInt();
                                    a.deleteLeader(leaderid);
                                    break;
                                case 7: {
                                    // delete project
                                    System.out.println("Please enter Project id : ");
                                    int Projectid = input.nextInt();
                                    a.deleteProject(Projectid);
                                    break;
                                }
                                case 8: {
                                    // delete task phase
                                    System.out.println("Please enter Project id , task id , TaskPhase : ");
                                    int Projectid = input.nextInt();
                                    int Taskid = input.nextInt();
                                    String Taskphase = input.next();
                                    a.deleteTaskPhase(Taskid, Projectid, Taskphase);
                                    break;
                                }
                                case 9: {
                                    // update task phase
                                    System.out.println("Please enter Project id , task id , Old Phase , New Phase : ");
                                    int Projectid = input.nextInt();
                                    int Taskid = input.nextInt();
                                    String OldPhase = input.next();
                                    String NewPhase = input.next();
                                    a.updateTaskPhase(Projectid, Taskid, OldPhase, NewPhase);
                                    break;
                                }
                                case 10: {
                                    // update emp username
                                    System.out.println("Please enter employee id and the new username : ");
                                    int id = input.nextInt();
                                    username = input.next();
                                    a.updateEmpUsername(id, username);
                                    break;
                                }
                                case 11: {
                                    // update emp name
                                    System.out.println("Please enter employee id and the correct name : ");
                                    int id = input.nextInt();
                                    String name = input.next();
                                    a.updateEmpName(id, name);
                                    break;
                                }
                                case 12: {
                                    // update emp age
                                    System.out.println("Please enter employee id and the age : ");
                                    int id = input.nextInt();
                                    int age = input.nextInt();
                                    a.updateEmpAge(id, age);
                                    break;
                                }
                                case 13: {
                                    // update leader username
                                    System.out.println("Please enter leader id and the new username : ");
                                    int id = input.nextInt();
                                    username = input.next();
                                    a.updateLeaderUsername(id, username);
                                    break;
                                }
                                case 14: {
                                    // update leader name
                                    System.out.println("Please enter leader id and the correct name : ");
                                    int id = input.nextInt();
                                    String name = input.next();
                                    a.updateLeaderName(id, name);
                                    break;
                                }
                                case 15: {
                                    // update leader age
                                    System.out.println("Please enter leader id and the age : ");
                                    int id = input.nextInt();
                                    int age = input.nextInt();
                                    a.updateLeaderAge(id, age);
                                    break;
                                }
                                case 16: {
                                    // update leader to be employee
                                    System.out.println("Please enter employee id : ");
                                    int id = input.nextInt();
                                    a.updateEmpToLeader(id);
                                    break;
                                }
                                case 17: {
                                    // update employee to leader
                                    System.out.println("Please enter leader id : ");
                                    int id = input.nextInt();
                                    a.updateLeaderToEmp(id);
                                    break;
                                }
                                case 18:
                                    // assign emp to leader
                                    System.out.println("Please enter leader's name, id, age, username, password : ");
                                    a.assignEmployeeToLeader(l1, e1);
                                    break;
                                case 19:
                                    // assign employee to project
                                    a.assignLeaderToProject(p1, l1);
                                    break;
                                case 20:
                                    // LogIn empolyee
                                    System.out.println("Please enter employee username, password : ");
                                    username = input.next();
                                    password = input.next();
                                    a.loginEmp(username, password);
                                    break;
                                case 21:
                                    // LogIn employee
                                    System.out.println("Please enter leader username, password : ");
                                    username = input.next();
                                    password = input.next();
                                    a.loginLeader(username, password);
                                    break;
                                case 22:
                                    break;

                            }
                            System.out.println(menu);
                        } while (menu != 22);

                    } else if (menu == 2) { // start leader
                        System.out.println("enter leader's username and password");
                        String username = input.next();
                        String password = input.next();
                        while (!l1.username.equals(username) || !l1.password.equals(password)) {
                            System.out.println("invalid credentials");
                            System.out.println("enter username and password");
                            username = input.next();
                            password = input.next();
                        }
                        System.out.println("login successfully");

                        while (menu != 12) {
                            System.out.println(
                                    "1.  add employee\n2.  create mission\n3.  create task  \n4.  show all tasks  \n5.  evaluate task"
                                            + "\n6.  reassign task\n7.  edit task field\n8.  end task\n9.  arrival time \n10. departure time"
                                            + "\n11. Accept or reject leave request\n12. Exit\n");
                            menu = input.nextInt();
                            switch (menu) {
                                case 1:
                                    // add employee
                                    System.out.println("Please enter employee's name, id, age, username, password : ");
                                    String nameemp = input.next();
                                    int idemp = input.nextInt();
                                    int ageemp = input.nextInt();
                                    username = input.next();
                                    password = input.next();
                                    employee tempE = new employee(nameemp, idemp, ageemp, username, password);
                                    l1.addEmp(tempE);
                                    break;
                                case 2: {
                                    // create mission
                                    System.out.println("Please enter task id ");
                                    int TaskId = input.nextInt();
                                    l1.createMission(TaskId, e1);
                                    break;
                                }
                                case 3: {
                                    // create task
                                    System.out.println("Please enter task id: ");
                                    int TaskId = input.nextInt();
                                    task t = new task(TaskId);
                                    l1.createTask(t);
                                    break;
                                }
                                case 4:
                                    // show all tasks
                                    System.out.println("All tasks : ");
                                    l1.showAll();
                                    break;
                                case 5: {
                                    // evaluate task
                                    System.out.println("Please enter task id");
                                    int TaskId = input.nextInt();
                                    System.out.println("Please evaluate task (good , very good , excellent)");
                                    String v = input.next();
                                    l1.evaluateTask(TaskId, v);
                                    break;
                                }
                                case 6: {
                                    // re assign task
                                    System.out.println("Please enter task id");
                                    int TaskId = input.nextInt();
                                    l1.reassignTask(e1, e2, TaskId);
                                    break;
                                }
                                case 7: {
                                    // edit task field
                                    System.out.println("Please task code  , description , id , title !!");
                                    int TaskCode = input.nextInt();
                                    int TaskId = input.nextInt();
                                    String d = input.next();
                                    String t = input.next();
                                    l1.editTaskField(TaskId, d, TaskCode, t);
                                    break;
                                }
                                case 8:
                                    // end task
                                    // emp id , task id
                                    System.out.println("Please enter employee id , task id");
                                    int empid = input.nextInt();
                                    int taskid = input.nextInt();
                                    l1.endTask(empid, taskid);
                                    break;
                                case 9:
                                    // arrival time
                                    l1.attended();
                                    break;
                                case 10:
                                    // end time
                                    l1.departure();
                                    break;
                                case 11:
                                    // leader accept or reject leave request
                                    int i = 0;
                                    for (Leave l : leaves) {
                                        System.out.println(i + " " + l.empID + " " + l.type);
                                        System.out.println("1. accept request");
                                        System.out.println("2. reject request");
                                        l.accepted();
                                        l.rejected();
                                    }
                                    break;
                                case 12:
                                    break;
                                default:
                                    System.out.println("Invalid choice please try again!!");
                                    break;
                            }
                        }
                    } // end leader
                    else if (menu == 3) { // start employee
                        System.out.println("enter employee's username and password");
                        String username = input.next();
                        String password = input.next();
                        while (!e1.username.equals(username) || !e1.password.equals(password)) {
                            System.out.println("invalid credentials");
                            System.out.println("enter username and password");
                            username = input.next();
                            password = input.next();
                        }
                        System.out.println("login successfully");

                        while (menu != 5) {

                            System.out.println(
                                    "1.  view tasks\n2.  arrival time \n3.  departure time \n4.  Show missions\n5.  Exit");
                            menu = input.nextInt();
                            switch (menu) {
                                case 1:
                                    // view tasks
                                    e1.viewTasks();
                                    break;
                                case 2:
                                    // arrival time , attendance
                                    e1.attended();
                                    break;
                                case 3:
                                    e1.departure();
                                    break;
                                case 4:
                                    e1.showMissions();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Invalid choice , please try again !!");
                                    break;
                            }
                        }
                    }

                } // end employee
            }
        }
    }

}