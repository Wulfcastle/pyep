// Type your examination number here
package question2_netbeans;

public class Enclosure {

    private String type;
    private int number;
    private double size;
    private char cat;

    public Enclosure(String type, int number, double size, char category) {
        this.type = type;
        this.number = number;
        this.size = size;
        this.cat = category;
    }

    public boolean isSuitable(int numberOfAnimals, char category, double size) {
        boolean flag = false;
        switch (category) {
            case 'L':
                if (size >= numberOfAnimals * 18) {
                    flag = true;
                }
                break;

            case 'M':
                if ((size <= 18 * numberOfAnimals) && (size >= 12 * numberOfAnimals)) {
                    flag = true;
                }
                break;

            case 'S':
                if ((size <= 12 * numberOfAnimals) && (size >= 7 * numberOfAnimals)) {
                    flag = true;
                }
                break;
        }
        return flag;
    }
    
    public String toString() {
        String output = String.format("%s...%s\n Enclosure Size: %.2f \n Number of Animals: %d \n", type, cat, size, number);
        return output;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setCat(char cat) {
        this.cat = cat;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public double getSize() {
        return size;
    }

    public char getCat() {
        return cat;
    }
}
