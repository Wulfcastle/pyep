
public class Competitor {

    private String name;
    private int largeGameCount;
    private int smallGameCount;
    private int birdCount;

    public Competitor() {

    }

    public Competitor(String name) {
        this.name = name;
        this.largeGameCount = 0;
        this.smallGameCount = 0;
        this.birdCount = 0;
    }

    public void spotLarge() {
        largeGameCount++;
    }

    public void spotSmall() {
        smallGameCount++;
    }

    public void spotBird() {
        birdCount++;
    }

    public int calculatePoints() {
        int r = 0;
        r = (largeGameCount * 5) + (smallGameCount * 3) + (birdCount * 3);
        return r;
    }

    public int totalBirds() {
        int total = largeGameCount + smallGameCount + birdCount;
        return total;
    }

    public String getName() {
        return this.name;
    }

    public String mostSpotted() {
        int counter = 0;
        String mostSpotted = "";
        if (largeGameCount > counter) {
            counter = largeGameCount;
            mostSpotted = "Large Game";
        }
        if (smallGameCount > counter) {
            counter = smallGameCount;
            mostSpotted = "Small Game";
        }
        if (birdCount > counter) {
            counter = birdCount;
            mostSpotted = "Bird";
        }
        return mostSpotted;
    }

    public String toString() {
        String objStr = String.format("Competitor: %s \r\n\n Large : %5d  Small : %5d   Bird : %5d", getName(),
                largeGameCount, smallGameCount, birdCount);
        return objStr;
    }

}
