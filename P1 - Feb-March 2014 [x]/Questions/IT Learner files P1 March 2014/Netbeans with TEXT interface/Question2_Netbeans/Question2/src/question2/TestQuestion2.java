package question2;
//Type your examination number here.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestQuestion2 {

    /*public String[] importFile(String fileName) throws FileNotFoundException {
     String content = "";
        
     Scanner myTextFile = new Scanner(new File(fileName)).useDelimiter(",\\s*");
        
     while (myTextFile.hasNext()) {
     content = myTextFile.next();
     }
     myTextFile.close();
     String[] lines = content.split("\n");
     return lines;
     } */
    public static void main(String[] args) throws FileNotFoundException {
        int size = 0;
        Student[] arrData = new Student[20];
        Scanner sc = new Scanner(System.in);

        String content = "";
        Scanner myTextFile = new Scanner(new File("DataQ2.txt")).useDelimiter(",\\s*");

        while (myTextFile.hasNext()) {
            content = myTextFile.next();
        }
        myTextFile.close();
        String[] lines = content.split("\r\n");

        int counter = 0;
        while (counter < 20) { // Need to fix ArrayOutofBoundsException error here!
            for (int i = 0; i < lines.length; i = i + 4) {
                String name = lines[i];
                char gender = lines[i + 1].charAt(0);
                int questionairres = Integer.parseInt(lines[i + 2]);
                double hours = Double.parseDouble(lines[i + 3]);
                arrData[counter] = new Student(name, gender, questionairres, hours);
                counter++;
            }
        }

        char choice;
        do {
            System.out.println("   MENU\n");
            System.out.println("Option A");
            System.out.println("Option B");
            System.out.println("Option C");
            System.out.println("");
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");
            choice = sc.nextLine().toUpperCase().charAt(0);
            // OR
            // choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    for (Student student : arrData) {
                        System.out.print(student.toString() + "\n" + "\n");
                    }

                    break;
                case 'B':
                    double maleAverage = 0.00;
                    double femaleAverage = 0.00;
                    String maleName = "";
                    String femaleName = "";
                    for (Student student : arrData) {
                        switch (student.getGender()) {
                            case 'M':
                                if (student.calcAvg() > maleAverage) {
                                    maleAverage = student.calcAvg();
                                    maleName = student.getName();
                                }
                                break;
                            case 'F':
                                if (student.calcAvg() > femaleAverage) {
                                    femaleAverage = student.calcAvg();
                                    femaleName = student.getName();
                                }
                                break;
                        }                    
                    }
                    System.out.print("Students with the highest values: " + "\n"
                    + "Male: " + maleName + " with an average of " + maleAverage + "\n"
                    + "Female: " + femaleName + " with an average of " + femaleAverage + "\n");
                    break;
                case 'C':
                    System.out.print("Enter updated data seperated by a ;");
                    String data = sc.next();
                    String[] info = data.split(";");
                    boolean flag = false;
                    for (Student student : arrData) {
                        if (student.getName().equals(info[0])) {
                            student.setHours(student.getHours() + Double.parseDouble(info[3])); 
                            student.setQuestionnaires(student.getQuestionnaires() + Integer.parseInt(info[2]));
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false) {
                        System.out.print("The learner you have entered is not on the list");
                    } else if (flag == true) {
                        System.out.print("Try A again now");
                    }
                    break;
                case 'Q':
                    System.out.println("Quit");
            }
        } while (choice != 'Q');

    }
}
