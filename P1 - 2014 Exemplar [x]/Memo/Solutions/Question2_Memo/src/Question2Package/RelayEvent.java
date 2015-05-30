package Question2Package;

import java.util.Calendar;

/**
 *
 * Possible solution
 */
public class RelayEvent {

    private String event;
    private String team;
    private String year;
    private double recordTime;

    public RelayEvent(String event, String team, String year, double recordTime) {
        this.event = event;
        this.team = team;
        this.year = year;
        this.recordTime = recordTime;
    }

    public String getEvent() {
        return event;
    }

    public String getTeam() {
        return team;
    }

    public String getYear() {
        return year;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void checkForRecord(String newTeam, double newTime) {
        Calendar rightNow = Calendar.getInstance();
        int yr = rightNow.getWeekYear();
        if (newTime == recordTime) {
            team = team + ";" + newTeam;
            year = year + ";" + yr;
        }
        if (newTime < recordTime) {
            recordTime = newTime;
            team = newTeam;
            year = "" + yr;
        }

    }

    public String toString() {
        return "Current record for " + event + ":\n\nTeam:\t " + team + "\nYear:\t " + year + "\nTime:\t " + recordTime + " seconds\n";
    }
}
