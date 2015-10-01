
import java.util.Scanner;

public class TestQuestion2 {

    public static void main(String args[]) throws Exception {

        String accountNumber = "AC-23245";

        int members = 4;

        int[] arrWaterUse = {481, 438, 454, 353, 421, 396, 432};

        Household household = new Household(accountNumber, members, arrWaterUse);

        Scanner input = new Scanner(System.in);
        char ch = ' ';
        while (ch != 'Q') {
            System.out.println();
            System.out.println("         Menu");
            System.out.println(" ");
            System.out.println("       Option A ");
            System.out.println("       Option B ");
            System.out.println("       Option C ");
            System.out.println(" ");
            System.out.println("       Q - QUIT");
            System.out.println(" ");
            System.out.print("       Your choice? ");

            ch = input.nextLine().toUpperCase().charAt(0);

            switch (ch) {
                case 'A': {
                    String amountDetails = String.format("Total water usage: %d litres\n"
                            + "Average water usage: %.1f litres", household.calculateTotal(), household.calculateAvg());
                    System.out.print(String.format("%s\n%s\n\n", household.toString(), amountDetails));
                    break;
                }

                case 'B': {

                    String headings = String.format("\n\nDays & Amount of Water Exceeding the Average"
                            + "\n============================================\n"
                            + "Average Water Usage (per day) : %.2f litres\n\n"
                            + "%s %25s\n", household.calculateAvg(), "Days", "Value exceeding average (in litres)");

                    int[] usageDetails = household.getWaterUsage();

                    String details = "";
                    for (int i = 0; i < usageDetails.length; i++) {
                        double average = household.calculateAvg();
                        double difference = usageDetails[i] - average;
                        if (difference > 0) {
                            details += String.format("%d %25.2f\n", i + 1, difference);
                        }
                    }

                    String output = headings + details;
                    System.out.print(output + "\n\n");

                    break;
                }

                case 'C': {
                    String risk = "";

                    if (household.determineHighRisk(400.00) == false) {
                        risk = "Low-Risk Household";
                    } else {
                        risk = "High-Risk Household";
                    }

                    int highestUsageDay = household.determineHighDay();

                    String output = String.format("%s\n\n"
                            + "The day on which the most water was used: %d\n"
                            + "%s\n", household.toString(), highestUsageDay, risk);
                    System.out.print(output);

                    break;
                }
                case 'Q': {
                    System.exit(0);
                } // case

            } // switch

        } // while

    } // main

} // class
