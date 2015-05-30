
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestQuestion3 {

    public static void main(String[] args) {

        String[] arrData
                = {"Civilisation#PS3", "Command & Conquer#PC", "Solitaire#Xbox",
                    "Chess#PC", "Tetris#PC", "Chess#PC", "Command & Conquer#PC",
                    "Civilisation#PC", "SimCity#PC", "Tetris#PC", "SimCity#PC",
                    "Civilisation#PS3", "Tetris#PS3", "Command & Conquer#PS3",
                    "SimCity#PC", "Solitaire#PC", "Sims#Xbox", "SimCity#Xbox",
                    "Command & Conquer#PC", "Chess#PS3", "Tetris#Xbox",
                    "Civilisation#Xbox", "SimCity#PS3", "Solitaire#PC", "Sims#Xbox",
                    "Command & Conquer#PS3", "Command & Conquer#PS3", "Civilisation#PS3",
                    "Civilisation#PS3", "Command & Conquer#Xbox", "SimCity#PS3",
                    "Solitaire#PS3", "Civilisation#Xbox", "Command & Conquer#PC",
                    "SimCity#PC"};

        Scanner sc = new Scanner(System.in);
        // OR
        // BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        char choice = ' ';
        do {
            System.out.println("   MENU\n");
            System.out.println("Option A");
            System.out.println(""); // Printing blank line
            System.out.println("Option B");
            System.out.println(""); // Printing blank line
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");

            choice = sc.nextLine().toUpperCase().charAt(0);
            // OR
            // choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    String output = String.format("%-25s%-20s\n\n", "Game", "Platform");
                    for (String gameData : arrData) {
                        String[] info = gameData.split("#");
                        String game = info[0];
                        String platform = info[1];
                        output = output + String.format("%-25s%-20s\n", game, platform);
                    }
                    System.out.print(output);
                    break;
                case 'B':
                    Scanner gameSC = new Scanner(System.in);
                    System.out.print("Enter Game to search for below :");
                    String searchedGame = gameSC.next();
                    
                    double numberOfItems = 0;
                    double pc = 0;
                    double ps3 = 0;
                    double xbox = 0;
                    
                    boolean flag = false;
                        for (String gameData : arrData) {
                            String[] info = gameData.split("#");
                            String game = info[0];
                            String platform = info[1];
                            if (game.equals(searchedGame)) {
                                flag = true;
                                numberOfItems = numberOfItems + 1;
                                switch (platform) {
                                    case "PC":
                                        pc = pc + 1;
                                        break;
                                    case "PS3":
                                        ps3 = ps3 + 1;
                                        break;
                                    case "Xbox":
                                        xbox = xbox + 1;
                                        break;
                                }
                            } 
                        }
                        
                    double percentagePC = (pc / numberOfItems) * 100;
                    double percentagePS3 = (ps3 / numberOfItems) * 100;
                    double percentageXbox = (xbox / numberOfItems) * 100;
                    
                        if (flag == true) {
                            String strOutput = "\n" + searchedGame + " was mentioned " + numberOfItems + " times.";
                            strOutput = strOutput + "\n" + "\n" + "Percentage use of devices: ";
                            strOutput = strOutput + String.format("\n%-25s%-20s%-20s\n", "PC", "PS3", "XBOX");
                            DecimalFormat df = new DecimalFormat("0.00");
                            percentagePC = Double.parseDouble(df.format(percentagePC));
                            percentagePS3 = Double.parseDouble(df.format(percentagePS3));
                            percentageXbox = Double.parseDouble(df.format(percentageXbox));
                            strOutput = strOutput + String.format("%-25s%-20s%-20s", percentagePC + "%", percentagePS3 + "%", percentageXbox + "%");
                            System.out.print(strOutput);
                        } else {
                            System.out.print("The game you entered was not found.");
                        }

                    break;
                case 'Q':
                    System.exit(0);
            }
        } while (choice != 'Q');
    }

}
