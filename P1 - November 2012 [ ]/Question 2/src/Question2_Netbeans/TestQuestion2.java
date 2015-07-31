// TYPE YOUR EXAMINATION NUMBER HERE
package question2_netbeans;
import java.io.*;

public class TestQuestion2 {
    public static void main(String[] args) throws Exception {
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
                    break;
                case 'B':
                    break;
                case 'Q':
                    System.out.println("Quit");
            }
        } while (choice != 'Q');
    } // main       
}