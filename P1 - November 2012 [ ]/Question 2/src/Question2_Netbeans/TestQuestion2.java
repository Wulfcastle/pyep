// TYPE YOUR EXAMINATION NUMBER HERE
package question2_netbeans;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestQuestion2 {

    //public Enclosure[] enclosures = new Enclosure[30];
    public static void main(String[] args) throws Exception {
        Enclosure[] enclosures = new Enclosure[30];

        String content = "";
        try {
            Scanner textFile = new Scanner(new File("DataQ2.txt")).useDelimiter(",\\s*");
            while (textFile.hasNext()) {
                content = textFile.next(); // Adding all content from Text File to String "content" variable.
            }
            String[] details = content.split("\r\n");
            int i = 0;
            for (String object : details) {
                String[] parts = object.split("#");
                String[] individualInfo1 = parts[0].split(";");
                String name = individualInfo1[0];
                int numberOfAnimals = Integer.parseInt(individualInfo1[1]);
                String[] individualInfo2 = parts[1].split(";");
                double size = Double.parseDouble(individualInfo2[0]);
                char category = individualInfo2[1].toUpperCase().charAt(0);
                enclosures[i] = new Enclosure(name, numberOfAnimals, size, category);
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.print("The file that you have specified doesn't exist.");
        }

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        char choice = ' ';

        do {
            System.out.println("MENU");
            System.out.println();
            System.out.println("A. Option A");
            System.out.println("B. Option B");
            System.out.println();
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");
            choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    for (Enclosure enclosure : enclosures) {
                        if (enclosure != null) {
                            System.out.print(enclosure.toString() + "\n");
                        }
                    }

                    break;

                case 'B':
                    boolean enclosureFound = false;
                    System.out.print("Enter the type of animal: ");
                    String name = kb.readLine();
                    System.out.print(String.format("Enter the number of types of %s : ", name));
                    int number = Integer.parseInt(kb.readLine());
                    System.out.print(String.format("Enter the category under which %ss fall under : ", name));
                    char category = kb.readLine().toUpperCase().charAt(0);
                    int i=0;
                    for (Enclosure enclosure : enclosures) {
                        if (null == enclosure && enclosureFound == false) {
                            System.out.print("\n\n No suitable enclosures were found.\n\n");
                            break;
                        } else if ("XXX".equals(enclosure.getType()) && enclosure.isSuitable(number, category, enclosure.getSize())) {
                            enclosure.setType(name);
                            enclosure.setNumber(number);
                            enclosure.setCat(category);
                            enclosureFound = true;
                            System.out.print(String.format("\n These animals were placed in enclosure number %d.\n\n"
                                    + " Updated details of the enclosures \n ======================= \n\n %s", i, enclosure.toString() + "\n\n\n"));
                            break;
                        }
                        i++;
                    }

                    break;

                case 'Q':
                    System.out.println("Quit");
            }

        } while (choice != 'Q');
    } // main    
/*
     public void scanTextFile(String filename) {
     String content = "";
     try {
     Scanner textFile = new Scanner(new File(filename)).useDelimiter(",\\s*");
     while (textFile.hasNext()) {
     content = textFile.next(); // Adding all content from Text File to String "content" variable.
     }
     String[] details = content.split("\r\n");
     int i = 0;
     for (String object : details) {
     String[] parts = object.split("#");
     String[] individualInfo1 = parts[0].split(";");
     String name = individualInfo1[0];
     int numberOfAnimals = Integer.parseInt(individualInfo1[1]);
     String[] individualInfo2 = parts[1].split(";");
     double size = Double.parseDouble(individualInfo2[0]);
     char category = individualInfo2[1].toUpperCase().charAt(0);
     enclosures[i] = new Enclosure(name, numberOfAnimals, size, category);
     i++;
     }
     } catch (FileNotFoundException ex) {
     System.out.print("The file that you have specified doesn't exist.");
     }
     }
     */
}
