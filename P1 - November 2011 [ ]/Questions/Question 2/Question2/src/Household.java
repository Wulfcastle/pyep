
public class Household {

    private String account;
    private int members;
    private int[] arrWaterUse;

    public Household() {

    }

    public Household(String Account, int Members, int[] arrWater) {
        this.account = Account;
        this.members = Members;
        this.arrWaterUse = arrWater;

    }

    public int calculateTotal() {
        int total = 0;
        for (int usage : arrWaterUse) {
            total += usage;
        }
        return total;
    }

    public double calculateAvg() {
        double total = this.calculateTotal();
        double average = total / 7;
        return average;
    }
    
    public int determineHighDay() {
        double highestUsage = 0.0;
        int day = 0;
        for (int i=0; i < arrWaterUse.length; i++) {
            if (arrWaterUse[i] > highestUsage) {
                highestUsage = arrWaterUse[i];
                day = i;
            }
        }
        return day + 1;
    }

    public boolean determineHighRisk(double dayLimit) {
        boolean highRisk = false;
        double average = this.calculateAvg();
        
        int numberExceeded = 0;
        for (int dailyUsage : arrWaterUse) {
            if (dailyUsage > dayLimit) {
                numberExceeded++;
            }
        }
        
        if (average < dayLimit) {
            if (numberExceeded <= 2) {
                highRisk = false;
            }
        } else { 
            highRisk = true;
        }
        return highRisk;
    }
    
    public int[] getWaterUsage() {
        return this.arrWaterUse;
    }

    public String toString() {
        String accountDetails = String.format("Account number: %s\n"
                + "Number of members: %d\n"
                + "Daily Water Usage :\n", account, members);
        String days = "Days:       ";
        for (int i=1; i < 8; i++) {
            days += String.format("%10d", i);
        }
        String usageDetails = "Water Used:";
        for (int usage : arrWaterUse) {
            usageDetails += String.format("%10d", usage);
        }
        
        String output = String.format("\n\n%s\n%s\n%s\n\n", accountDetails, days, usageDetails);
        return output;
    }

}
