//Enter your examination number here.
package Question2Package;

import java.text.DecimalFormat;

public class Delivery {

    private int deliveryNum;
    private String truckNum;
    private double fuelUsed;
    private int odoStart;
    private int odoEnd;

    double[][] tollFees = {
        //      L       M       H
        /*RN1*/{105.50, 135.00, 210.00},
        /*RN2*/ {35.00, 54.00, 82.00},
        /*RN3*/ {85.00, 129.00, 205.00},
        /*RN4*/ {112.00, 170.00, 219.00}};

    public Delivery(int deliverNumber, String truckNumber, int odoStart, int odoEnd) {
        this.deliveryNum = deliverNumber;
        this.truckNum = truckNumber;
        this.odoStart = odoStart;
        this.odoEnd = odoEnd;
        this.fuelUsed = 0.00;
    }

    public double determineTollFees(String route) {
        int column = 0;
        int row = 0;
        switch (this.truckNum) {
            case "Tr1":
            case "Tr2":
                column = 0;
                break;
            case "Tr3":
                column = 1;
                break;
            case "Tr4":
            case "Tr5":
                column = 2;

        }
        switch (route) {
            case "RN1":
                row = 0;
                break;
            case "RN2":
                row = 1;
                break;
            case "RN3":
                row = 2;
                break;
            case "RN4":
                row = 3;
                break;
        }
        return tollFees[row][column];
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public double getFuelUsed() {
        return this.fuelUsed;
    }

    public int calculateDistance() {
        int distance = this.odoEnd - this.odoStart;
        return distance;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        String output = "Delivery number:" + deliveryNum + "\nTruck number: " + truckNum + "\nOdometer reading: \n\t(Start) " + odoStart + "\n\t(End) " + odoEnd + "\nFuel used: " + df.format(fuelUsed) + " litre";
        return output;
    }
}
