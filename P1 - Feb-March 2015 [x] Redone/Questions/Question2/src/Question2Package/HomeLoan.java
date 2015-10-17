/*
 * Enter your examination number here
 */
package Question2Package;

import java.text.DecimalFormat;

public class HomeLoan {

    private String applicantName;
    private double disposableIncome;
    private double loanAmount;
    private int years;
    private double interestRate;

    DecimalFormat df = new DecimalFormat("R 0.00");

    public HomeLoan(String name, double income, double loanAmount) {
        this.applicantName = name;
        this.disposableIncome = income;
        this.loanAmount = loanAmount;
        this.years = 0;
        this.interestRate = 0.00;
    }

    public boolean isApproved() { // Question 2 is flawed at this point.
        boolean approval = false;
        if ((loanAmount > 800000) && (years > 20)) {
            approval = true;
        } else if ((loanAmount <= 600000) && (disposableIncome >= (this.calculateInstalmentAmount() * 1.3))) {
           approval = true;
        }
        return approval;
    }
    
    public String toString() {
        return String.format("Name of applicant: %s\n"
                + "Disposable Income: R%.2f\n"
                + "Loan Amount: R%.2f\n"
                + "Number of Years: %d\n"
                + "Interest Rate: %.2f%", this.applicantName, this.disposableIncome, this.loanAmount, this.years, this.interestRate);
    }

    public double calculateInstalmentAmount() {
        double payment, rate;
        int result;
        rate = interestRate / 100.0;
        payment = (rate * loanAmount) / (1 - ((Math.pow((1 + rate), (years * -1)))));
        result = (int) (Math.round(payment / 12));
        return result;
    }

    public String getName() {
        return this.applicantName;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

}
