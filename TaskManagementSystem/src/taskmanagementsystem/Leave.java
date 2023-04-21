package taskmanagementsystem;

public class Leave {
    int empID;
    String type;
    Boolean accepted;

    public Leave(int empID, String type) {
        this.empID = empID;
        this.type = type;
        accepted = false;
    }

    // accept the leave type
    public void accepted() {
        accepted = true;
    }

    // reject the leave
    public void rejected() {
        accepted = false;
    }

}
