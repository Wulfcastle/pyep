
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCompetitor {

    public static void main(String args[]) throws Exception {
        BufferedReader inKb = new BufferedReader(new InputStreamReader(System.in));
        char ch = ' ';

        Competitor competitor = null;
        int valid = 0;
        int invalid = 0;

        // <BEGIN> Scanning code
        String[] fileContents = null;
        String content = "";
        try {
            Scanner textFileScanner = new Scanner(new File("Sightings.txt")).useDelimiter(",\\*s");
            while (textFileScanner.hasNext()) {
                content = textFileScanner.next();
            }
            textFileScanner.close();
            fileContents = content.split("\r\n");
            competitor = new Competitor(fileContents[0]);
        } catch (FileNotFoundException ex) {
            System.out.print("The file was not found");
        }

        // <END> Scanning Code
        for (String animal : fileContents) {
            if (animal.contains("(M)")) {
                invalid++;
                System.out.print(String.format("%s is not in a valid category \n", animal.replace("(M)", "")));
            }
            if (animal.contains("(L)")) {
                competitor.spotLarge();
                valid++;
            }
            if (animal.contains("(S)")) {
                competitor.spotSmall();
                valid++;
            }
            if (animal.contains("(B)")) {
                competitor.spotBird();
                valid++;
            }
        }

        System.out.print(String.format("\n\n%d valid categories processed \n %d invalid categories processed", valid, invalid));
        while (ch != 'Q') {

            System.out.println();
            System.out.println("           Menu");
            System.out.println(" ");
            System.out.println("           Option A");
            System.out.println("           Option B");
            System.out.println(" ");
            System.out.println("           Q - QUIT");
            System.out.println(" ");
            System.out.print("          Your choice? ");

            ch = inKb.readLine().toUpperCase().charAt(0);

            switch (ch) {
                case 'A': {
                    System.out.print("\n\n" + competitor.toString() + "\n\n\n");
                    break;
                }

                case 'B': {
                    BufferedWriter writer = null;
                    try {
                        File myFile = new File(String.format("%s.txt", competitor.getName()));
                        System.out.print(myFile.getCanonicalPath());
                        writer = new BufferedWriter(new FileWriter(myFile));
                        writer.write(competitor.toString());

                    } catch (Exception e) {
                        System.out.print(e);
                    }
                    try {
                        writer.close();
                    } catch (Exception ex) {
                        System.out.print(ex);
                    }
                }
                break;
                case 'Q': {
                    System.exit(0);
                } // case

            } // switch

        } // while

    } // main

} // class
