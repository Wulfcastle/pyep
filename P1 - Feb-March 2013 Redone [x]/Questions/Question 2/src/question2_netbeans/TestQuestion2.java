//Type your exam number here
package question2_netbeans;

import java.io.*;
import javax.swing.*;
import java.text.*;
import java.util.Scanner;

public class TestQuestion2 {

    public static void main(String[] args) throws Exception {

        Tour[] arrTours = new Tour[50];

        try {
            String[] data = readTextFile("DataQ2.txt");
            int counter = 0;
            for (int i = 0; i < data.length; i = i + 2) {
                String names = data[i];
                String information = data[i + 1];
                String[] arrNames = names.split("&");
                String guideName = arrNames[0];
                String destination = arrNames[1];
                String[] seperateInfo = information.split(" days#");
                int tourists = Integer.parseInt(seperateInfo[1]);
                String[] furtherInfo = seperateInfo[0].split(" for ");
                String monthName = furtherInfo[0];
                int days = Integer.parseInt(furtherInfo[1]);
                arrTours[counter] = new Tour(guideName, destination, monthName, days, tourists);
                counter++;

            }
        } catch (FileNotFoundException e) {
            System.out.print(e);
            System.exit(0);
        }

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        char choice = ' ';
        do {
            System.out.println("   MENU\n");
            System.out.println("Option A");
            System.out.println("");
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");

            choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    System.out.print("Enter the month in which you'd like to go on a tour : ");
                    String month = kb.readLine();
                    String output = String.format("Tours for the month of %s\n====================", month);
                    output += String.format("\n%-10s%-15s\n", "Number", "Destination");
                    for (int i = 0; i < arrTours.length; i++) {
                        if (arrTours[i] == null) {
                            break;
                        }
                        String tourMonth = arrTours[i].getMName();
                        String destination = arrTours[i].getDName();
                        if (tourMonth.equals(month)) {
                            output += String.format("%-10d%-15s\n", i + 1, destination);
                        }
                    }
                    System.out.print(output);
                    System.out.print("\n\nEnter the number of the tour which you'd like to go on : ");
                    int number = Integer.parseInt(kb.readLine()) - 1;
                    System.out.print(arrTours[number].toString());

                    System.out.print("\n\nChoose a character from the name of the tour destination in order to stand a chance to be "
                            + "granted a 25% discount on the daily tariff of the tour : ");
                    char selectedChar = kb.readLine().charAt(0);
                    double originalTariff = arrTours[number].getTariff();
                    double newTariff = originalTariff * 0.75;
                    char luckyChar = arrTours[number].findLuckyChar();
                    if (selectedChar == luckyChar) {
                        System.out.print(String.format("Congratulations! You have received a 25 percent discount on the daily tariff!\n"
                                + "The tariff was R%.2f per day. it has been reduced to R%.2f per day", originalTariff, newTariff));

                    } else {
                        System.out.print(String.format("The lucky character was the letter %s. No discount has been awarded, the tariff is therefore"
                                + " still R%.2f per day.", luckyChar + "", originalTariff));
                    }

                    break;
                case 'Q':
                    System.out.println("QUIT");
            }
        } while (choice != 'Q');

    }

    public static String[] readTextFile(String fileName) throws FileNotFoundException {
        String content = "";
        Scanner scanner = new Scanner(new FileReader(fileName)).useDelimiter(",\\s*");
        while (scanner.hasNext()) {
            content = scanner.next();
        }
        String[] lines = content.split("\r\n");
        return lines;
    }
}
