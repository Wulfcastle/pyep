package question2_netbeans;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Type your exam number here
 *
 */
public class Tour {

    private String gName;
    private String dName;
    private String mName;
    private int numD;
    private int numT;
    private double tariff;

    public Tour(String guideName, String destination, String monthName, int days, int members) {
        this.gName = guideName;
        this.dName = destination;
        this.mName = monthName;
        this.numD = days;
        this.numT = members;
        setTariff();
    }

    public double getTariff() {
        return tariff;
    }

    public String getDName() {
        return dName;
    }

    public String shortenString(String month) {
        char[] monthCharArray = month.toCharArray();
        String output = "";
        for (char ch : monthCharArray) {
            if (ch == monthCharArray[0]) {
                //Do nothing, leave first character out.
            }
            if (ch != 'a' && ch != 'i' && ch != 'o' && ch != 'u') {
                output += ch;
            }
        }
        return output;
    }
    
    public char findLuckyChar() {
        int maxLength = this.dName.trim().length();
        Random rand = new Random();
        int randomNumber = rand.nextInt(maxLength - 0) + 1;
        char luckyChar = this.dName.trim().charAt(randomNumber);
        return luckyChar;
    }
    
    public String toString() {
        String output = String.format("\n\nMonth: %s\n"
                + "Destination: %s with %s as a tour guide.\n"
                + "Price : R%.2f per day for a period of %d days\n" 
                + "%d tourists are taking this tour.\n\n", this.shortenString(this.mName), this.dName, this.gName, this.tariff, this.numD, this.numT);
        return output;
    }

    public void setTariff() {
        switch (this.mName) {
            case "April":
            case "September":
            case "December":
                this.tariff = 1250.00;
                break;
            case "January":
            case "February":
            case "August":
            case "October":
            case "November":
                this.tariff = 1000.00;
                break;
            case "March":
            case "May":
            case "June":
            case "July":
                this.tariff = 900.00;
                break;

        }
    }

    public String getGName() {
        return gName;
    }

    public int getNumT() {
        return numT;
    }

    public String getMName() {
        return mName;
    }

    public int getNumD() {
        return numD;
    }

}
