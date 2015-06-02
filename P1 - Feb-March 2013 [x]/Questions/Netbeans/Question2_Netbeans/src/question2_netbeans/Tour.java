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

    public Tour(String guideName, String destination, String month, int days, int members) {
        this.gName = guideName;
        this.dName = destination;
        this.mName = month;
        this.numD = days;
        this.numT = members;
        this.tariff = this.calculateTariff();
    }

    public double calculateTariff() {
        double tariffAmt = 0.0;
        switch (mName) {
            case "April":
            case "September":
            case "December":
                tariffAmt = 1250.00;
                break;
            case "March":
            case "May":
            case "June":
            case "July":
                tariffAmt = 900.00;
                break;
            case "January":
            case "February":
            case "August":
            case "October":
            case "November":
                tariffAmt = 1000.00;
                break;
        }
        return tariffAmt;
    }

    public String shortenMonth() {
        String shortenedString = "";
        for (int i = 1; i < shortenedString.length(); i++) {
            switch (mName.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    shortenedString = mName.replace(mName.charAt(i) + "", "");
            }
        }
        return shortenedString;
    }

    public char findLuckyChar() {
        Random randomizer = new Random();
        int randomIndex = randomizer.nextInt(((dName.length() - 1) - 0) + 1) + 0;
        while (dName.charAt(randomIndex) == ' ') {
            randomIndex = randomizer.nextInt(((dName.length() - 1) - 0) + 1) + 0;
        }
        char luckyChar = dName.charAt(randomIndex);
        return luckyChar;
    }
    
    public void grantDiscount() {
        tariff = tariff/100*75;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("R 0.00");
        String output = "Month: " + mName + "\n"
                + "Destination: " + dName + " with " + gName + " as the tour guide." + "\n"
                + "Price: " + df.format(tariff) + " per day for a period of " + numD + " days." + "\n"
                + "Number of Tour Members: " + numT + " tourists taking this tour." + "\n\n";
        return output;
    }

    public double getTariff() {
        return tariff;
    }

    public String getDName() {
        return dName;
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
