package TestQuestion2_GUI;

// Type your examination number here...

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DanceCouple {

    private String dance_p1;
    private String dance_p2;
    private char professional;

    public DanceCouple(String partner1, String partner2, char professional) {
        this.dance_p1 = partner1;
        this.dance_p2 = partner2;
        this.professional = professional;

    }

    public int getWeighting() {
        int weighting = 0;
        switch (this.professional) {
            case 'A': // Both dance partners are professional dancers
                weighting = 1;
                break;
            case 'B':// The first dance parnet is a professional dancer
            case 'C': // The second dance partner is a professional dancer.
                weighting = 2;
                break;
            case 'D': // Neither of the dance partners are professional dancers.
                weighting = 3;
                break;
        }
        return weighting;
    }

    public int calculateFinalScore(int[] arrScores) {
        int weighting = this.getWeighting();
        arrScores[0] = arrScores[0] * weighting;
        arrScores[2] = arrScores[2] * weighting;
        int sum = 0;
        for (double score : arrScores) {
            sum += score;
        }
        return sum;
    }
    
    public void writeToText(int[] arrScores) throws IOException {
        File file = new File("Scores.txt");
        if (file.exists() != true) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file, true);
        writer.append(String.format("%s,%s,%d\r\n", this.dance_p1, this.dance_p2, this.calculateFinalScore(arrScores)));
        writer.flush();
        writer.close();
    }
    
    public String scoresToString(int[] array) {
        String output = String.format("Dance couple: %s & %s\n"
                + "Scores from the judges : %d, %d, %d, %d\n"
                + "Weighting Value : %d\n"
                + "Final Score: %d\n", this.dance_p1, this.dance_p2, 
                array[0], array[1], array[2], array[3], this.getWeighting(), this.calculateFinalScore(array));
        return output;
    }

    public String toString() {
        String output = String.format("Dance couple : %s & %s\n"
                + "Professional dance status: %s", this.dance_p1, this.dance_p2, Character.toString(professional));
        return output;
    }
    
    public String getDancePartner1() {
        return dance_p1;
    }

    public String getDancePartner2() {
        return dance_p2;
    }

    public char getProfessional() {
        return professional;
    }

}
