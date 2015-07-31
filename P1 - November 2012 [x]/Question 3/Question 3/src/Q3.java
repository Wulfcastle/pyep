
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shimal
 */
public class Q3 {

    public static void main(String[] args) throws IOException {

        String[] arrTic = {"RCm158", "ADM33", "RCf250", "RAf5", "BRM32", "ADm236",
            "RCm23", "RDM54", "RCf17", "RAm12", "ADm9", "RCF43", "RDm140", "RDm23",
            "ACF113", "ABf30", "RDm22", "ARf38", "RCF8", "RAf53", "RCf12", "ABF156",
            "ADM31", "ADM47", "RAf48", "ABF246", "ABf59", "RRM321",
            "ABm36", "RCF31", "RAm445", "ACn26"};

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

                    // REMEMBER to use Nested-If Statements in logical and operator-heavy if-else's
                    System.out.print("\n\nInvalid entries: \n ======================\n\n");
                    for (String entry : arrTic) {
                        if (new Q3().checkValidity(entry) == false) {
                            System.out.print(entry + "\n");
                            // entry = "Z";
                        }
                    }

                    break;
                case 'B':

                    Random randomizer = new Random();

                    int randomNumber = 999;
                    int max = arrTic.length - 1;
                    boolean valid = false;
                    while (valid == false) {
                        randomNumber = randomizer.nextInt((max - 0) + 1) + 0;
                        if (new Q3().checkValidity(arrTic[randomNumber]) == true) {
                            System.out.print(String.format("\nThe position of the winning ticket in the array is %d\n", randomNumber + 1));
                            System.out.print(String.format("Thw winning ticket : %s\n\n\n", arrTic[randomNumber]));
                            valid = true;
                        } else {
                            System.out.print("Invalid.");
                        }
                    }

                    break;
                case 'C':
                    String[][] arrPoints
                            = {{"AA", "0"},
                            {"AB", "0"},
                            {"AC", "0"},
                            {"AD", "0"},
                            {"RA", "0"},
                            {"RB", "0"},
                            {"RC", "0"},
                            {"RD", "0"}};

                    for (String entry : arrTic) {
                        if (new Q3().checkValidity(entry) == true) {
                            switch (entry.substring(0, 2)) {
                                case "AA":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[0][1]) + 5;
                                        arrPoints[0][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[0][1]) + 12;
                                        arrPoints[0][1] = points + "";
                                    }
                                    break;
                                case "AB":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[1][1]) + 5;
                                        arrPoints[1][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[1][1]) + 12;
                                        arrPoints[1][1] = points + "";
                                    }
                                    break;
                                case "AC":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[2][1]) + 5;
                                        arrPoints[2][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[2][1]) + 12;
                                        arrPoints[2][1] = points + "";
                                    }
                                    break;
                                case "AD":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[3][1]) + 5;
                                        arrPoints[3][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[3][1]) + 12;
                                        arrPoints[3][1] = points + "";
                                    }
                                    break;
                                case "RA":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[4][1]) + 5;
                                        arrPoints[4][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[4][1]) + 12;
                                        arrPoints[4][1] = points + "";
                                    }
                                    break;
                                case "RB":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[5][1]) + 5;
                                        arrPoints[5][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[5][1]) + 12;
                                        arrPoints[5][1] = points + "";
                                    }
                                    break;
                                case "RC":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[6][1]) + 5;
                                        arrPoints[6][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[6][1]) + 12;
                                        arrPoints[6][1] = points + "";
                                    }
                                    break;
                                case "RD":
                                    if (entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                                        int points = Integer.parseInt(arrPoints[7][1]) + 5;
                                        arrPoints[7][1] = points + "";
                                    }
                                    if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F') {
                                        int points = Integer.parseInt(arrPoints[7][1]) + 12;
                                        arrPoints[7][1] = points + "";
                                    }
                                    break;
                            }
                        }
                    }
                    int counter = 0;
                    int arrayIndexOfGold = 0;
                    for (int i = 0; i < 8; i++) {
                        int points = Integer.parseInt(arrPoints[i][1]);
                        if (points > counter) {
                            counter = points;
                            arrayIndexOfGold = i;
                        }
                    }

                    counter = 0;
                    int arrayIndexOfSilver = 0;
                    for (int i = 0; i < 8; i++) {
                        if (i == arrayIndexOfGold) {
                            i++;
                        } else {
                            int points = Integer.parseInt(arrPoints[i][1]);
                            if (points > counter) {
                                counter = points;
                                arrayIndexOfSilver = i;
                            }
                        }
                    }
                    counter = 0;
                    int arrayIndexOfBronze = 0;
                    for (int i = 0; i < 8; i++) {
                        if (i == arrayIndexOfSilver || i == arrayIndexOfGold) {
                            i++;
                        } else {
                            int points = Integer.parseInt(arrPoints[i][1]);
                            if (points > counter) {
                                counter = points;
                                arrayIndexOfBronze = i;
                            }
                        }
                    }

                    System.out.print(String.format("\n\n\nMedal winning displays:\n\n"
                            + "%s%25s%25s\n", "Medal", "Display", "Points"));
                    System.out.print(String.format("%s%25s%25s\n", "Gold", arrPoints[arrayIndexOfGold][0], arrPoints[arrayIndexOfGold][1]));
                    System.out.print(String.format("%s%25s%25s\n", "Silver", arrPoints[arrayIndexOfSilver][0], arrPoints[arrayIndexOfSilver][1]));
                    System.out.print(String.format("%s%25s%25s\n\n\n", "Bronze", arrPoints[arrayIndexOfBronze][0], arrPoints[arrayIndexOfBronze][1]));

                    break;
            }
        } while (choice != 'Q');
    }

    public boolean checkValidity(String entry) {
        boolean flag = false;
        int i = 0;
        if (entry.charAt(0) == 'A' || entry.charAt(0) == 'R') {
            if (entry.charAt(1) == 'A' || entry.charAt(1) == 'B' || entry.charAt(1) == 'C' || entry.charAt(1) == 'D') {
                if (entry.charAt(2) == 'M' || entry.charAt(2) == 'F' || entry.charAt(2) == 'm' || entry.charAt(2) == 'f') {
                    flag = true;
                }
            }
        } else {
            flag = false;
        }
        return flag;

    }

}
