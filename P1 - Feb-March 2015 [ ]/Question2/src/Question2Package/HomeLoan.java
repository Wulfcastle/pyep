/*
 * Enter your examination number here
 */
package Question2Package;

import java.text.DecimalFormat;

public class HomeLoan {

    /*
     @params
     interestRate is entered as a percentage
     */
    private String applicantName;
    private double disposableIncome;
    private double loanAmount;
    private int years;
    private double interestRate;
    
    DecimalFormat df = new DecimalFormat("R 0.00");

    public HomeLoan(String name, double income, double amount) {
        this.applicantName = name;
        this.disposableIncome = income;
        this.loanAmount = amount;
        this.years = 0;
        this.interestRate = 0;
    }

    public String getName() {
        return this.applicantName;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setInterest(double interest) {
        this.interestRate = interest;
    }

    public boolean isAppproved() {
        boolean approved = false;
        if (this.loanAmount > 800000 && this.years > 20) {
            double monthlyInstallments = this.calculateInstalmentAmount();
            if (disposableIncome >= (monthlyInstallments * 1.3)) {
                approved = true;
            } else {
                approved = false;
            }
        }
        return approved;
    }
    
    public String toString() {
        String output = String.format("Name of applicant: %2s\n"
                + "Disposable Income: %2s\n"
                + "Loan Amount: %2s\n"
                + "Number of Years: %2d\n"
                + "Interest Rate: %2.2f percent\n", this.applicantName, df.format(this.disposableIncome), df.format(this.loanAmount), this.years, this.interestRate );
        return output;
    }

    public double calculateInstalmentAmount() {
        double payment, rate;
        int result;
        rate = interestRate / 100.0;
        payment = (rate * loanAmount) / (1 - ((Math.pow((1 + rate), (years * -1)))));
        result = (int) (Math.round(payment / 12));
        return result;
    }
}
