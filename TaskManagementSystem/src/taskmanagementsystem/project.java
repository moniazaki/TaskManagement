
package taskmanagementsystem;

import java.util.ArrayList;

public class project {
    ArrayList<task> tasks = new ArrayList<>();
    ArrayList<leader> leaders = new ArrayList<>();
    int id;

    public project(int id) {
        this.id = id;
    }

    // to make admin assign leader to specific project
    public void addLeader(leader l) {
        leaders.add(l);
    }

    // update the tasks of the project from all the leaders
    public void takeTasksfromLeaders() {
        tasks.clear();
        for (leader l : leaders) {
            tasks.addAll(l.tasks);
        }
        System.out.println(tasks);
    }

}
