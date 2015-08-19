package Question2Package;


public class Order {
    
    private String name;
    private int numGroup;
    private int numSingle;
    private char paid;
    
    
    public Order(String name, int numberGroup, int numberSingle, char paid) {
        this.name = name;
        this.numGroup = numberGroup;
        this.numSingle = numberSingle;
        this.paid = paid;
    }

    public double calculatCost() {
        double cost = (numGroup * 15.70) + (numSingle*12.50);
        return cost;
    }
    
    public double calculateDiscount() {
        double discount = 0.00;
        if ((this.numGroup >= 4 || this.numSingle >= 4) && this.paid == 'Y') {
            discount = this.calculatCost() * 0.05;
        }
        return discount;
    }
    
    public String toString() {
        String output = String.format("Name: %s\r\n"
                + "Group: %d\r\n"
                + "Individual: %d\r\n"
                + "Paid: %s\r\n", this.name, this.numGroup, this.numSingle, Character.toString(this.paid));
        return output;
    }
    
    
    public String getName() {
        return name;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public int getNumSingle() {
        return numSingle;
    }

//=====  Question 2.1.2 (b)    
    public char getPaid() {
        return paid;
    }
//===== Question 2.1.3 =======================    
//===== Question 2.1.4 =======================    
//===== Question 2.1.5 =======================    
//===== Question 2.1.6 =======================    
}
