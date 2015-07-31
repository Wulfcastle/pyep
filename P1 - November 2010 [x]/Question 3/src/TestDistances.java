
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import javax.crypto.Mac;
import javax.swing.*;

/* The following assignment statements must be used to initialise the array arrEntries:
	
 arrEntries[0] = "12,15:2h00";
 arrEntries[1] = "12,15:5h00";
 arrEntries[2] = "9,21:6h00";
 arrEntries[3] = "10,10:7h00";
 arrEntries[4] = "7,8:10h00";
 arrEntries[5] = "12,18:11h00";
 arrEntries[6] = "9,15:14h00";
 arrEntries[7] = "7,20:17h00";
 arrEntries[8] = "11,7:19h00";
 arrEntries[9] = "10,10:20h00";
 arrEntries[10] = "2,1:23h00";
 arrEntries[11] = "12,18:24h00";
   
 */
public class TestDistances {
    
    public static void main(String[] args) throws Exception {
        
        String[] arrEntries = new String[12];
        
        arrEntries[0] = "12,15:2h00";
        arrEntries[1] = "12,15:5h00";
        arrEntries[2] = "9,21:6h00";
        arrEntries[3] = "10,10:7h00";
        arrEntries[4] = "7,8:10h00";
        arrEntries[5] = "12,18:11h00";
        arrEntries[6] = "9,15:14h00";
        arrEntries[7] = "7,20:17h00";
        arrEntries[8] = "11,7:19h00";
        arrEntries[9] = "10,10:20h00";
        arrEntries[10] = "2,1:23h00";
        arrEntries[11] = "12,18:24h00";
        
        String[][] arrEntryDetails = new String[12][4];
        int i = 0;
        
        Scanner input = new Scanner(System.in);
        
        char ch = ' ';
        while (ch != 'Q') {
            
            System.out.println();
            System.out.println("             Menu");
            System.out.println(" ");
            System.out.println("             Option A");
            System.out.println("             Option B");
            System.out.println(" ");
            System.out.println("             Q - QUIT");
            System.out.println(" ");
            System.out.print("            Your choice? ");
            
            ch = input.nextLine().toUpperCase().charAt(0);
            
            switch (ch) {
                case 'A': {
                    
                    for (String entry : arrEntries) {
                        String[] details = entry.split(":");
                        String[] positionInfo = details[0].split(",");
                        String time = details[1];
                        double xPosition = Double.parseDouble(positionInfo[0]);
                        double yPosition = Double.parseDouble(positionInfo[1]);
                        double distance = new TestDistances().calculateDistance(xPosition, yPosition);
                        String roundedDistance = String.format("%.0f", distance);
                        
                        arrEntryDetails[i][0] = time;
                        arrEntryDetails[i][1] = roundedDistance;
                        arrEntryDetails[i][2] = xPosition + "";
                        arrEntryDetails[i][3] = yPosition + "";
                        i++;
                    }
                    
                    System.out.print("\n\n\nDistances from the watering hole \n ==============================\n\n");
                    System.out.print(String.format("%5s%25s%25s%25s", "Time", "Distance", "X-Position", "Y-Position\n"));
                    for (String[] details : arrEntryDetails) {
                        System.out.print(String.format("%5s%25s%25s%25s\n", details[0], details[1], details[2], details[3]));
                        
                    }
                    System.out.print("\n\n\n\n");
                    break;
                }
                
                case 'B': {

                    // Try using a Three-Dimensional Array for this Question.
                    int numberOfTypes = 0;
                    int animalCounter = 1;
                    
                    System.out.print("\n\n Enter the number of different types of animals in the sample space : ");
                    numberOfTypes = Integer.parseInt(input.nextLine());
                    
                    while (animalCounter != numberOfTypes + 1) {
                        System.out.print(String.format("\nEnter the name of animal type %d :", animalCounter));
                        String animalName = input.nextLine();
                        System.out.print(String.format("Enter the number of subsets of animal %d in the sample space :\n", animalCounter));
                        int numberOfSubsets = Integer.parseInt(input.nextLine());
                        int randomNumber = new TestDistances().generateEvenNumber();
                        for (int j = 0; j < numberOfSubsets; j++) {                            
                            String tag = animalName.substring(0, 2) + animalName.charAt(animalName.length() - 1) + randomNumber;
                            String indicator = String.format("-%d", j + 1);
                            String uniqueIdentifier = tag + indicator;
                            if (j == 0) {
                                System.out.print(String.format("%s %65s\n", animalName, "Tag"));
                            }
                            System.out.print(String.format("%d. %75s\n", j + 1, uniqueIdentifier));
                        } 
                        animalCounter++;
                    }
                    
                    break;
                }
                
                case 'Q': {
                    System.exit(0);
                } // case

            } // switch

        } // while          

    } // main method

    public int generateEvenNumber() {
        Random randomizer = new Random();
        int randomNumber = 1;
        while (randomNumber % 2 != 0) {
            randomNumber = randomizer.nextInt((999 - 100) + 1) + 100;
        }
        return randomNumber;
    }
    
    public double calculateDistance(double AnimalXPosition, double AnimalYPosition) {
        final int WaterXPosition = 10;
        final int WaterYPosition = 10;
        double distance = Math.sqrt(Math.pow((AnimalXPosition - WaterXPosition), 2)
                + Math.pow((AnimalYPosition - WaterYPosition), 2));
        return distance;
    }
    
}  // class

