
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        // OR
        // BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int[] arrOriginalCouples = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] arrDanceCouples = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        String content = "";
        Scanner textFile = new Scanner(new FileReader("DataQ3.txt")).useDelimiter(",\\s*");

        while (textFile.hasNext()) {
            content = textFile.next();
        }

        String[] lines = content.split("\r\n");

        String validData = "";
        for (String line : lines) {
            String[] lineInfo = line.split("#");

            String[] individualInfo = lineInfo[0].split(";");
            int age = Integer.parseInt(individualInfo[1]);

            individualInfo = lineInfo[1].split(";");
            int danceCouple = Integer.parseInt(individualInfo[1]);

            boolean danceCoupleValidation = false;

            for (int coupleNumber : arrDanceCouples) {
                if (danceCouple == coupleNumber) {
                    danceCoupleValidation = true;
                }
            }

            if (age > 18 && danceCoupleValidation == true) {
                validData = validData + line + "\n";
            }
        }

        String[] validSMSs = validData.split("\n");

        char choice = ' ';
        do {
            System.out.println("   MENU\n");
            System.out.println("Option A");
            System.out.println("Option B");
            System.out.println("");
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");

            choice = sc.nextLine().toUpperCase().charAt(0);
            // OR
            // choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':

                    String output = String.format("%-5s%-25s%-25s\n\n", "No.", "Name", "Cellphone Number");
                    int counter = 0;
                    for (String sms : validSMSs) {
                        counter = counter + 1;

                        String[] information = sms.split("#");
                        String[] individualInfo = information[0].split(";");
                        String name = individualInfo[0];
                        String age = individualInfo[1];

                        individualInfo = information[1].split(";");
                        String number = individualInfo[0];

                        int numberExtension = Integer.parseInt(number.substring(1, 3));
                        String vote = "";

                        if (numberExtension != 27) {
                            vote = "International Vote";
                        } else {
                            vote = "Local Vote";
                        }

                        String danceCouple = individualInfo[1];
                        String smsDetails = String.format("%-5s%-25s%-25s%-25s\n", counter, name, number, vote);
                        output = output + smsDetails;

                    }

                    int validVotes = validSMSs.length;
                    int totalVotes = lines.length;
                    int invalidVotes = totalVotes - validVotes;

                    String voteCount = "\n" + "\n" + "Invalid Votes: " + invalidVotes + "\n"
                            + "Valid Votes: " + validVotes + "\n";

                    System.out.print(output + voteCount);

                    break;

                case 'B':

                    int[][] danceReport = new int[14][2];

                    for (int i = 0; i < 14; i++) {
                        danceReport[i][0] = i;
                        int votes = 0;
                        for (String sms : validSMSs) {
                            String lastThreeDigits = sms.substring(sms.length()-5);
                            String[] rawNumber = lastThreeDigits.split(";");
                            String coupleNumber = rawNumber[1];
                            if (Integer.parseInt(coupleNumber) == i) {
                                votes = votes + 1;
                            }
                        }
                        danceReport[i][1] = votes;                        
                    }
                    
                    String reportOutput = String.format("%-15s%-20s\n\n", "Dance Couple", "Votes");
                    
                    for (int[] coupleData : danceReport) {
                        int danceCoupleNumber = coupleData[0];
                        int coupleVotes = coupleData[1];
                        boolean eliminatedCouple = true;
                        for (int couple : arrDanceCouples) {
                            if (danceCoupleNumber == couple) {
                                eliminatedCouple = false;
                            }
                        }
                        String coupleDetails = "";
                        if (eliminatedCouple == false) {
                            coupleDetails = String.format("%-15s%-20s\n", danceCoupleNumber, coupleVotes);
                        } else {
                            coupleDetails = String.format("%-15s%-20s\n", danceCoupleNumber, "(Eliminated)");
                        }
                        
                        reportOutput = reportOutput + coupleDetails;
                    }
                    
                    System.out.print(reportOutput); 

                    break;
                case 'Q':
                    System.out.println("QUIT");
            }
        } while (choice != 'Q');
    }

}
