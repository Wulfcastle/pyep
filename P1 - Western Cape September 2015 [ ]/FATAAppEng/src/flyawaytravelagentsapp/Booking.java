// Your name here
package flyawaytravelagentsapp;

public class Booking {
    
    private String firstName;
    private String surname;
    private String idNumber;
    private char gender;
    private boolean paid;
    private double dailyRate;
    
    public Booking(String firstName, String surname, String idNumber, char gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.idNumber = idNumber;
        this.gender = gender;
        this.paid = false;
        this.dailyRate = 895.00;
    }
    
    public String paymentMade() {
        if (this.paid == true) {
            return "Paid";
        } else {
            return "Not Paid";
        }
    }

    public boolean isPaid() {
        return paid;
    }
    
    public double amountPayable(int numberDays) {
        return (dailyRate * numberDays);
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setIdNum(String idNum) {
        this.idNumber = idNum;
    }
    
    public String toString() {
        return String.format("Name: %s %s\n"
                + "ID Number: %s\n"
                + "Gender: %s\n"
                + "Payment: %s\n", firstName, surname, idNumber, gender + "", this.paymentMade());
    }

}
