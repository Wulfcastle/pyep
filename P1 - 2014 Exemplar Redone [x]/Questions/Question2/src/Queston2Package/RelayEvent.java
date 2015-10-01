/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queston2Package;

import java.util.Date;
import javax.swing.JOptionPane;

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

    public void checkForRecord(String team, double newRecordTime) {
        Date currentDate = new Date();
        if (newRecordTime < this.recordTime) {
            // New Record
            this.team = team;
            this.year = (currentDate.getYear() + 1900) + "";
            this.recordTime = newRecordTime;
        } else if (newRecordTime == this.recordTime) {
            // Update Record Adding New Team
            this.team += String.format("; %s", team);
            this.year += String.format("; %s", ((currentDate.getYear() + 1900) + ""));
        } else if (newRecordTime > this.recordTime) {
            JOptionPane.showMessageDialog(null, "Time is greater than current record.");
        }
    }

    public String toString() {
        String output = String.format("Current record for %s\n\n"
                + "Team : %s\n"
                + "Year : %s\n"
                + "Time : %.2f seconds\n", this.event, this.team, this.year, this.recordTime);
        return output;
    }

    public String getEvent() {
        return this.event;
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
