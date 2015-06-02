//Type your exam number here
package question2_netbeans;

import java.io.*;
import java.text.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TestQuestion2 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Tour[] arrTours = new Tour[50];
        int counter = 0;
        
        String content = "";
        try {
            Scanner textFile = new Scanner(new FileReader("DataQ2.txt")).useDelimiter(",\\s*");
            while (textFile.hasNext()) {
                content = textFile.next();
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Your file could not be found unfortunately.");
        }
        
        String[] lines = content.split("\r\n");
        
        for (int j = 0; j < lines.length; j = j + 2) {
            String tourName = lines[j];
            String secondLine = lines[j + 1];
            String[] secondLineData = secondLine.split("#");
            int members = Integer.parseInt(secondLineData[1]);
            String[] remainingData = secondLineData[0].split(" for ");
            String month = remainingData[0];
            String strDays = remainingData[1].replace(" days", "");
            int days = Integer.parseInt(strDays);
            
            if (counter == 50) {
                break;
            } else {
                arrTours[counter] = new Tour("XXX", tourName, month, days, members);
                counter++;
            }
        }

        /*

        
         String[][] tourData = new String[50][2];

         // Fix to ArroyOutOfBoundsException
         int bounds = 0;
         if (lines.length > 50 * 2) {
         bounds = 50;
         } else { // Length of TextFile is less than 100
         bounds = lines.length / 2; // For every two lines in the Text File one Tour object can be created.
         }

         counter = 0;
         for (int j = 0; j < bounds; j++) {
         for (int i = 0; i < 2; i++) {
         tourData[j][i] = lines[counter];
         counter++;
         }
         }

         for (int i = 0; i < 50; i++) {
         for (int j = 0; j < 2; j = j + 2) {
         String tourName = tourData[i][j];
         String[] secondLine = tourData[i][j + 1].split("#");  // Referenced to second line from the text file (looping)
         int members = Integer.parseInt(secondLine[1]);
         String[] remainingData = secondLine[0].split(" for ");
         String month = remainingData[0];
         String strDays = remainingData[1].replace(" days", "");
         int days = Integer.parseInt(strDays);

         while (tourName != null) {
         arrTours[i] = new Tour("XXX", tourName, month, days, members);
         counter++;
         }
         }
         } */
        /*
         counter = 0;
         for (String[] individualTourData : tourData) {
         if (counter == 50 || individualTourData != null) {
         break;
         } else {
         String tourName = individualTourData[0];
         String[] secondLine = individualTourData[1].split("#");  // Referenced to second line from the text file (looping)
         int members = Integer.parseInt(secondLine[1]);
         String[] remainingData = secondLine[0].split(" for ");
         String month = remainingData[0];
         String strDays = remainingData[1].replace(" days", "");
         int days = Integer.parseInt(strDays);

         arrTours[counter] = new Tour("XXX", tourName, month, days, members);
         counter++;
         }
         } */
        char choice = ' ';
        
        do {
            System.out.println("   MENU\n");
            System.out.println("Option A");
            System.out.println("");
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");
            
            choice = sc.next().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    
                    System.out.print("Enter month here: ");                    
                    String userInputtedMonth = sc.next();
                    String output = String.format("\n\n%-30s\n", "Tours for the month of " + userInputtedMonth);
                    String underline = String.format("%-30s\n\n", "=====================");
                    output = output + underline;
                    output = output + String.format("%-10s%-25s\n\n", "Number", "Destination");
                    
                    for (int i = 0; i < arrTours.length; i++) {
                        if (arrTours[i] == null) {
                            break;
                        } else if (arrTours[i].getMName().equals(userInputtedMonth)) {
                            output = output + String.format("%-10s%-25s\n", (i + 1), arrTours[i].getDName());
                        }
                    }
                    
                    System.out.print(output + "\n\n\n");
                    
                    System.out.print("Would you like more info on one of the displayed tours?. Answer Y or N : "); 
                    
                    if (sc.next().toUpperCase().charAt(0) == 'N') {
                        break;
                    } else {
                        
                        System.out.print("Please enter the number of the tour you'd like more info on: ");
                        int tourNumber = Integer.parseInt(sc.next().charAt(0) + "");
                        Tour selecedTour = arrTours[tourNumber - 1];
                        System.out.print("\n\n" + selecedTour.toString());
                        System.out.print("To receive a discount, pick a character from the name of your destination. If the character is a lucky character," 
                                + "you will receive a 25% discount on your tariff : ");
                        char luckyChar = selecedTour.findLuckyChar();
                        char chosenCharacter = sc.next().charAt(0);
                        if (chosenCharacter == luckyChar) {
                            System.out.print("You have received a 25% discount." + "\n");
                            selecedTour.grantDiscount();
                            System.out.print("Your new details are : "  + "\n" + selecedTour.toString());
                        } else {
                            System.out.print("You have not entered the lucky character. Unfortunately you will not receive a discount \n\n" );
                        }
                    }
                    break;
                case 'Q':
                    System.out.println("QUIT");
            }
        } while (choice
                != 'Q');
        
    }
}
