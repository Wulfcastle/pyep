/**
 * Type your exam number here
 **/

   import java.io.*;
   import javax.swing.*;
   import java.text.*;

    public class TestQuestion2 
	 {

       public static void main(String[] args) throws Exception 
      {
         BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			 
         char choice = ' ';
         do {
            System.out.println("   MENU\n");
            System.out.println("Option A");
            System.out.println("");
            System.out.println("Q - QUIT");
            System.out.println("\nYour choice?  ");
         
            choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
               case 'A':
                  break;
               case 'Q':
                  System.out.println("QUIT");
            }
         } while (choice != 'Q');
      
      }          
   
   }
