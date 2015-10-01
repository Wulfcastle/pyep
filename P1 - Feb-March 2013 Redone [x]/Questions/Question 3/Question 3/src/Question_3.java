
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shimal
 */
public class Question_3 {

    public static String[] arrTourists = {"Rachel Delarosa@Canada#SH#11861", "Corradino Grande@Spain#RO#5788",
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

    public static void main(String[] args) throws IOException {

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

                    int totalEuros = 0;
                    for (String tourist : arrTourists) {
                        String[] details = tourist.split("#");
                        String[] touristDetails = details[0].split("@");
                        String country = touristDetails[1];
                        int amountSpent = Integer.parseInt(details[2]);
                        switch (country) {
                            case "Germany":
                            case "France":
                            case "Spain":
                                totalEuros += amountSpent;
                        }
                    }
                    double totalRands = totalEuros * 10.75;
                    DecimalFormat df = new DecimalFormat(" R 0 000 000.00");
                    System.out.print(String.format("\n\nTotal Amount in Euros: %d\n"
                            + "Total amount in South African Rands: %s", totalEuros, df.format(totalRands)));
                    break;
                case 'B':
                    System.out.print(String.format("%s\n\n", updateRobbenIslandTour()));
                    break;
                case 'C':
                    updateRobbenIslandTour();
                    String[][] tourRatings = new String[6][3];
                    tourRatings[0][0] = "Cape Winelands";
                    tourRatings[1][0] = "Garden Route";
                    tourRatings[2][0] = "Kruger National park";
                    tourRatings[3][0] = "Robben Island (English Tour)";
                    tourRatings[4][0] = "Robben Island (Other Tour)";
                    tourRatings[5][0] = "Shakaland";
                    for (int i = 0; i < tourRatings.length; i++) {
                        tourRatings[i][1] = ""; // Initializing ratings.
                        tourRatings[i][2] = 0 + ""; // Initalizing number of tourists to zero.
                    }
                    int numberTourists;
                    for (String tourist : arrTourists) {
                        numberTourists = 0;
                        String[] details = tourist.split("#");
                        String destination = details[1];
                        switch (destination) {
                            case "CA":
                                numberTourists = Integer.parseInt(tourRatings[0][2]);
                                tourRatings[0][2] = (numberTourists+1) + "";
                                break;
                            case "GA":
                                numberTourists = Integer.parseInt(tourRatings[1][2]);
                                tourRatings[1][2] = (numberTourists+1) + "";
                                break;
                            case "KR":
                                numberTourists = Integer.parseInt(tourRatings[2][2]);
                                tourRatings[2][2] = (numberTourists+1) + "";
                                break;
                            case "ROEnglish":
                                numberTourists = Integer.parseInt(tourRatings[3][2]);
                                tourRatings[3][2] = (numberTourists+1) + "";
                                break;
                            case "ROOther":
                                numberTourists = Integer.parseInt(tourRatings[4][2]);
                                tourRatings[4][2] = (numberTourists+1) + "";
                                break;
                            case "SH":
                                numberTourists = Integer.parseInt(tourRatings[5][2]);
                                tourRatings[5][2] = (numberTourists+1) + "";
                                break;
                        }
                    }
                    // Assigning rating
                    for (int i = 0; i < tourRatings.length; i++) {
                        int numTourists = Integer.parseInt(tourRatings[i][2]);
                        int rating = numTourists / 3;
                        for (int j = 0; j < rating; j++) {
                            tourRatings[i][1] += "*";
                        }
                    }
                    System.out.print(String.format("\n\nStar rating of tours:\n"
                            + "============================================================================================\n"
                            + "%-30s%-30s%-10s\n"
                            + "=============================================================================================\n", 
                            "Destination", "Rating", "Number of Tourists"));
                    for (String[] destination : tourRatings) {
                        System.out.print(String.format("%-30s%-30s%-10s\n", destination[0], destination[1], String.format("(%s)",destination[2])));
                    }
                    System.out.print("\n\n");
                    break;
                case 'Q':
                    System.out.println("Quit");
            }
        } while (choice != 'Q');
    }

    public static String updateRobbenIslandTour() {
        String output = String.format("\nList of English-speaking tourists to Rebben Island\n========================\n");
        for (int i = 0; i < arrTourists.length; i++) {
            String[] details = arrTourists[i].split("#");
            String destination = details[1];
            String[] touristDetails = details[0].split("@");
            String touristName = touristDetails[0];
            String country = touristDetails[1];
            if (destination.equals("RO")) {
                if (country.equals("England") || country.equals("Canada")) {
                    // English Speaking
                    arrTourists[i] = arrTourists[i].replace("#RO#", "#ROEnglish#");
                    output += String.format("%s\n", touristName);
                } else {
                    // Non-English Speaking
                    arrTourists[i] = arrTourists[i].replace("#RO#", "#ROOther#");
                }
            }
        }
        return output;
    }

}
