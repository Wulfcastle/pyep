
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import javax.swing.*;

public class TestVisitors {

    public static void main(String[] args) throws Exception {
        String[] arrLearners = new String[20];
        String[] arrVisitors = new String[20];
        arrLearners[0] = "Susan Thompson,Maths:77";
        arrLearners[1] = "Eric Ntumba,IT:89";
        arrLearners[2] = "Sean Franklin,Accounting:70";
        arrLearners[3] = "Mohammed Naidoo,Maths:68";
        arrLearners[4] = "Rowan Huntley,IT:77";
        arrLearners[5] = "Elizabeth Xaba,Economics:77";
        arrLearners[6] = "Sue Daniels,IT:69";
        arrLearners[7] = "Zane Shameez,Maths:9";
        arrLearners[8] = "Mpho Anderson,Science:81";
        arrLearners[9] = "Bryan Smith,IT:75";
        arrLearners[10] = "Christopher Khumalo,Accounting:78";
        arrLearners[11] = "Camilla Johnson,Science:88";
        arrLearners[12] = "Taryn Peterson,Science:70";
        arrLearners[13] = "Jack Nelson,Maths:68";
        arrLearners[14] = "Joe Zimmerman,Science:76";
        arrLearners[15] = "Gregory Thompson,IT:87";
        arrLearners[16] = "Dwane Franklin,IT:89";
        arrLearners[17] = "Sean Franklin,Accounting:70";
        arrLearners[18] = "Mohammed Naidoo,Maths:68";
        arrLearners[19] = "Cindy Mokoena,IT:70";

        Scanner input = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < arrLearners.length; i++) {
            String[] data = arrLearners[i].split(",");
            String[] subjectInfo = data[1].split(":");
            String name = data[0];
            String subject = subjectInfo[0];
            int mark = Integer.parseInt(subjectInfo[1]);
            if ((subject.equals("Maths") || subject.equals("Science") || subject.equals("IT")) && mark >= 70) {
                arrVisitors[count] = name;
                count++;
            }
        }

        char ch = ' ';
        while (ch != 'Q') {

            System.out.println();
            System.out.println("            MENU");
            System.out.println(" ");
            System.out.println("        A - Option A");
            System.out.println("        B - Option B");
            System.out.println(" ");
            System.out.println("        Q - QUIT");
            System.out.println(" ");
            System.out.print("        Your Choice? ");

            ch = input.nextLine().toUpperCase().charAt(0);

            switch (ch) {
                case 'A': {
                    arrVisitors = sort(arrVisitors);
                    System.out.print("\n\nAlphabetically Sorted List of Visitors : \n\n");
                    for (String visitor : arrVisitors) {
                        if (visitor == null) {
                            break;
                        } else {                            
                            System.out.print(String.format("%s\n", visitor));
                        }
                    }
                    break;
                }

                case 'B': {
                    arrVisitors = sort(arrVisitors);
                    System.out.print(String.format("\n\n%-25s%-25s\n\n", "Name", "Student Numbers"));
                    for (String visitor : arrVisitors) {
                        if (visitor == null) {
                            break;
                        } else {
                            System.out.print(String.format("%-25s%-25s\n", visitor, generateStudentNumber(visitor)));
                        }
                    }
                    break;
                }

                case 'Q': {
                    System.exit(0);
                } // case

            } // switch

        } // while          
    }

    public static String generateStudentNumber(String name) {
        int counter = 0;
        String code = "";
        for (int i = 0; i < name.length(); i++) {
            if (counter == 3) {
                break;
            } else {
                if (Character.toUpperCase(name.charAt(i)) != 'A' && Character.toUpperCase(name.charAt(i)) != 'E'
                        && Character.toUpperCase(name.charAt(i)) != 'I' && Character.toUpperCase(name.charAt(i)) != 'O'
                        && Character.toUpperCase(name.charAt(i)) != 'U' && Character.toUpperCase(name.charAt(i)) != ' ') {
                    code += Character.toUpperCase(name.charAt(i));
                    counter++;
                }
            }
        }
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            code += rand.nextInt(9 - 0) + 1;
        }
        return code;
    }

    public static String[] sort(String[] arrToSort) {
        int index = 0;
        String temp = "";
        for (int i = 0; i < arrToSort.length; i++) { // Loop through whole array and swap lowest with i
            if (arrToSort[i] == null) {
                break;
            }
            char benchmark = arrToSort[i].charAt(0);
            for (int j = i; j < arrToSort.length; j++) {
                if (arrToSort[j] == null) {
                    break;
                }
                // Loop through whole array and find lowest.
                if (arrToSort[j].charAt(0) < benchmark) {
                    benchmark = arrToSort[j].charAt(0);
                    index = j;
                }
            }
            temp = arrToSort[index];
            arrToSort[index] = arrToSort[i];
            arrToSort[i] = temp;
        }

        return arrToSort;
    }

}
