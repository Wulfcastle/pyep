/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Shimal
 */
public class Question3 {

    public static void main(String[] args) throws IOException {

        String[] arrData = {"Rachel Delarosa@Canada#SH#11861", "Corradino Grande@Spain#RO#5788",
            "Lucas Herder@Germany#KR#7709", "Estotz Lizarazu@France#GA#12349",
            "Chynna Taylor@England#GA#8551", "Renata Di@Spain#RO#4906",
            "Ugs Boulot-Tolle@France#CA#7300", "Lena Bucholtz@Germany#GA#10344",
            "Maria Heimpel@Germany#SH#9438", "Julian Amstadter@Germany#RO#8840",
            "Sofie Mosbauer@Germany#GA#5894", "Fiona Green@England#CA#9094",
            "Sara Escobedo@Canada#KR#4381", "Nataly Mahan@Canada#RO#12642",
            "Wyatt Parham@Canada#SH#4799", "Noah Donovan@Canada#SH#3888",
            "Joseph Scott@England#SH#7928", "Emily Smith@England#KR#3110",
            "Adriana Mancuso@Spain#RO#3724", "Cassandra Wilder@Canada#KR#12583",
            "Tomasino Camporese@Spain#KR#6777", "Stacy Anderson@England#RO#3686",
            "Guiraud Bluteau@France#RO#11592", "Damian Friedman@Canada#RO#9012",
            "Anne Loef@Germany#KR#13035", "Terence Brown@England#SH#8180",
            "Lion Ghislieri@Spain#RO#14343", "Giraudetz Girardin@France#CA#11644",
            "Guglielmo Capriati@Spain#SH#5408", "David Geiberger@Germany#RO#9854",
            "Irisa Cooper@England#KR#11456", "Hayden Mcdonough@Canada#KR#7840",
            "Jonas Hipp@Germany#RO#3137", "Emily Kohler@Germany#GA#6509",
            "Emily Thul@Germany#RO#8551", "Gino Lazzaretti@Spain#CA#2329",
            "Alex Hofstater@Germany#GA#6751", "Peers Scott@England#RO#9470",
            "Liliana Horne@Canada#RO#14689", "Leon Kleinpaul@Germany#RO#15194"};

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        char choice = ' ';
        do {
            System.out.println("    MENU");
            System.out.println();
            System.out.println("  Option A");
            System.out.println("  Option B");
            System.out.println("  Option C");
            System.out.println();
            System.out.println("  Q - QUIT");
            System.out.println("\n  Your choice?  ");
            choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':

                    String rawData = "";

                    for (String tourist : arrData) {
                        if (tourist.contains("France") || tourist.contains("Germany") || tourist.contains("Spain")) {
                            rawData = rawData + tourist + "\n"; // This whole method can be done better via ArrayLists
                        }
                    }

                    String[] tourists = rawData.split("\n");
                    int totalEuros = 0;
                    for (String tourist : tourists) {
                        String[] info = tourist.split("#");
                        String amount = info[2];
                        totalEuros = totalEuros + Integer.parseInt(amount);
                    }

                    double totalRands = totalEuros * 10.75;

                    System.out.print("\n\n" + "Total amount in Euros: " + totalEuros + "\n");
                    System.out.print("Total amount in South African Rands: " + totalRands + "\n\n\n");

                    break;
                case 'B':
                    String output = "List of English-speking tourists to Robben Island" + "\n" + "==================\n\n";

                    for (int i=0; i < arrData.length; i++) {
                        String[] data = arrData[i].split("@");
                        String name = data[0];
                        String[] remainingData = data[1].split("#");
                        String country = remainingData[0];
                        String tourCode = remainingData[1];
                        int amount = Integer.parseInt(remainingData[2]);

                        if ("RO".equals(tourCode)) {
                            switch (country) {
                                case "England":
                                case "Canada":
                                    arrData[i] = arrData[i].replace("#RO#", "#ROEnglish#");
                                    break;
                                case "France":
                                case "Germany":
                                case "Spain":
                                    arrData[i] = arrData[i].replace("#RO#", "#ROOther#");
                            }
                        }

                        if (arrData[i].contains("#ROEnglish#")) {
                            output = output + name + "\n";
                        }
                    }
                    System.out.print("\n" + output + "\n\n");

                    break;

                case 'C':
                    
                    // Start of Case B code (Has to be executed before Case C can be "accurately executed
                    
                    for (int i=0; i < arrData.length; i++) {
                        String[] data = arrData[i].split("@");
                        String name = data[0];
                        String[] remainingData = data[1].split("#");
                        String country = remainingData[0];
                        String tourCode = remainingData[1];
                        int amount = Integer.parseInt(remainingData[2]);

                        if ("RO".equals(tourCode)) {
                            switch (country) {
                                case "England":
                                case "Canada":
                                    arrData[i] = arrData[i].replace("#RO#", "#ROEnglish#");
                                    break;
                                case "France":
                                case "Germany":
                                case "Spain":
                                    arrData[i] = arrData[i].replace("#RO#", "#ROOther#");
                            }
                        }
                    }
                    
                    // End of Case B Code

                    String[] destinations = {"CA", "SH", "ROEnglish", "ROOther", "KR", "GA"};

                    String[][] tourDetails = new String[6][2];

                    for (int j = 0; j < 6; j++) {
                        for (int i = 0; i < 2; i++) {
                            tourDetails[j][i] = 0 + "";
                        }
                    }

                    for (String tourist : arrData) {
                        String[] data = tourist.split("@");
                        String name = data[0];
                        String[] remainingData = data[1].split("#");
                        String country = remainingData[0];
                        String tourCode = remainingData[1];
                        int amount = Integer.parseInt(remainingData[2]);

                        switch (tourCode) {
                            case "CA":
                                tourDetails[0][0] = "Cape Winelands";
                                tourDetails[0][1] = Integer.parseInt(tourDetails[0][1]) + 1 + "";
                                break;
                            case "GA":
                                tourDetails[1][0] = "Garden Route";
                                tourDetails[1][1] = Integer.parseInt(tourDetails[1][1]) + 1 + "";
                                break;
                            case "KR":
                                tourDetails[2][0] = "Kruger National Park";
                                tourDetails[2][1] = Integer.parseInt(tourDetails[2][1]) + 1 + "";
                                break;
                            case "ROEnglish":
                                tourDetails[3][0] = "Robben Island (English Tour)";
                                tourDetails[3][1] = Integer.parseInt(tourDetails[3][1]) + 1 + "";
                                break;
                            case "ROOther":
                                tourDetails[4][0] = "Robben Island (Other Tour)";
                                tourDetails[4][1] = Integer.parseInt(tourDetails[4][1]) + 1 + "";
                                break;
                            case "SH":
                                tourDetails[5][0] = "Shakaland";
                                tourDetails[5][1] = Integer.parseInt(tourDetails[5][1]) + 1 + "";
                                break;
                        }
                    }

                    String rating = "Star rating of tours:" + "\n" + "==========================" + "\n";
                    String header = String.format("%-35s%-15s%-20s\n", "Destination", "Rating", "Number of Tourists");
                    rating = rating + header + "==========================" + "\n\n";

                    for (String[] individualTour : tourDetails) {
                        String destination = individualTour[0];
                        
                        int numberTourists = Integer.parseInt(individualTour[1]);                        
                        String stars = "";
                        int numberOfStars = numberTourists / 3;
                        for (int i = 0; i < numberOfStars; i++) {
                            stars = stars + "*";
                        }
                        
                        String strTour = String.format("%-35s%-15s%-20s\n", destination, stars, "(" + numberTourists + ")");
                        rating = rating + strTour;                        

                    }
                    
                    System.out.print("\n\n" + rating + "\n\n"); 

                    break;
                case 'Q':
                    System.out.println("Quit");
            }
        } while (choice != 'Q');
    }

}
