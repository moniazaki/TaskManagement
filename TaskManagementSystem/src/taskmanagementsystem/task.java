package taskmanagementsystem;

import java.util.ArrayList;

public class task {

    private int code;
    private String title;
    private String description;
    private project project;
    private String priority;
    private String creatorName;
    private int estimationHours;
    java.util.Date startDate;
    java.util.Date endDate;
    String evaluation;
    int id;
    
    employee assigEmployee; //empolyee whp assigned to this task
    ArrayList<String> phases = new ArrayList<>();

    public task() {
    }

    public task(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "task [id=" + id + ", phases=" + phases + "]";
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public project getproject() {

        return project;
    }

    public void setproject(project p) {

        this.project = p;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public int getEstimationHours() {
        return estimationHours;
    }

    public void setEstimationHours(int estimationHours) {
        this.estimationHours = estimationHours;
    }

    public enum Priority {
        VERY_HIGH(4), HIGH(3), MEDIUM(2), LOW(1);

        private final int value;

        private Priority(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    };
    
    //add phase to the task by admin 
    public void addPhase(String phase) {
        phases.add(phase);
    }
   
    //delete phase from task by admin
    public boolean deletePhase(String phase) {
        for (String p : phases) {
            if (p.equalsIgnoreCase(phase)) {
                phases.remove(p);
                return true;
            }
        }
        return false;
    }
   
    //update phase to another phase by admin
    public boolean updatePhase(String oldphase, String newphase) {
        for (String p : phases) {
            if (p.equalsIgnoreCase(oldphase)) {
                phases.remove(oldphase);
                phases.add(newphase);
                return true;
            }
        }
        return false;
    }
}
