
package taskmanagementsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class employee extends user {
    ArrayList<task> tasks = new ArrayList<>(); // task for each employee
    ArrayList<timecard> timecards = new ArrayList<>();
    ArrayList<Mission> missions = new ArrayList<>();
    leader empLeader; // leader who supervise on employee
    timecard temp;

    public employee(String name, int id, int age, String username, String password) {
        super(name, id, age, username, password);
        temp = new timecard();
    }

    public employee() {
        temp = new timecard();
    }

    // add task to employee form leader
    public void addTask(task task) {
        tasks.add(task);
    }

    // print all employee's tasks
    public void viewTasks() {
        for (task t : tasks) {
            System.out.println(t);
        }
    }

    // remove task from employee
    public void removeTask(task t) {
        tasks.remove(t);
    }

    // addentance of the employee
    public void attended() {
        Date d = new Date();
        temp.arrivalTime = d;
    }

    // departure of employee
    public void departure() {
        Date d = new Date();
        temp.departureTime = d;
        timecards.add(temp);
    }

    public void showMissions() {

        for (Mission m : missions) {
            System.out.println(m.task.getTitle());
            System.out.println(m.task.getDescription());
            System.out.println("1. Accept");
            System.out.println("2. Reject");

            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();
            if (menu == 1) {
                m.accepted = true;
                empLeader.addTaskEmp(this, m.task);
            }
            missions.remove(m);
            if (missions.isEmpty())
                break;
        }
    }

}
