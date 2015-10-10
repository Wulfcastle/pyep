//Enter your name and sutname here -->
package question2package;

public class Salesperson {

    private String name;
    private int usedCarsSold;
    private int newCarsSold;
    private String makeLog;
    private String manufacturer;

    public Salesperson(String name, String make) {
        this.name = name;
        this.usedCarsSold = 0;
        this.newCarsSold = 0;
        this.makeLog = "";
        this.manufacturer = make;
    }

    //2.1.3 accessors newCarsSold and name
    public String getName() {
        return this.name;
    }

    public int gerNewCarsSold() {
        return this.newCarsSold;
    }

    public void incrementUsedCarTotal() {
        usedCarsSold++;
    }

    public void incrementNewCarTotal() {
        newCarsSold++;
    }

    public void updateLog(String make) {
        makeLog += String.format("%s#", make);
    }

    public int carsOfMake() {
        String[] manufacturers = makeLog.split("#");
        String manufacturer = this.manufacturer;
        int totalSalesByManufacturer = 0;
        for (String soldCar : manufacturers) {
            if (soldCar.equals(manufacturer)) {
                totalSalesByManufacturer++;
            }
        }
        return totalSalesByManufacturer;
    }

    public String toString() {
        return String.format("%-10s%-10d%-10d%-10d%-10d\n", this.name, (this.newCarsSold + this.usedCarsSold), this.newCarsSold, this.usedCarsSold, this.carsOfMake());
    }
    
    
}
