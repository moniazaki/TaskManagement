package taskmanagementsystem;

import java.util.Date;

public class timecard {
    int id;
    Date arrivalTime;
    Date departureTime;

    public timecard() {
        arrivalTime = new Date();
        departureTime = new Date();
    }
}