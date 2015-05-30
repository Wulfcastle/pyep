/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queston2Package;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Shimal
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

    public void checkForRecord(String newTeam, double newTime) {
        if (newTime < recordTime) {
            team = newTeam;
            int newYear = Calendar.getInstance().get(Calendar.YEAR);
            year = newYear + "";
            recordTime = newTime;
            JOptionPane.showMessageDialog(null, "You have set a new record!");
        } else if (newTime == recordTime) {
            team = team + "; " + newTeam;
            int newYear = Calendar.getInstance().get(Calendar.YEAR);
            year = year + "; " + newYear;
            JOptionPane.showMessageDialog(null, "You have equaled the previous record!");

        } else {
            JOptionPane.showMessageDialog(null, "Your time is slower than the record unfortunately.");
        }
    }

    public String toString() {
        String output = "Current record for " + event + "\n"
                + "Team: " + team + "\n"
                + "Year: " + year + "\n"
                + "Time: " + recordTime + "seconds";
        return output;
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

}
