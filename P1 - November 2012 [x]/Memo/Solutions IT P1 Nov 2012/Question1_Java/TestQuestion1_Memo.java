//Solution for Question 1   
   import java.io.*;
   import java.sql.*;
   import javax.swing.*;
   import java.util.Scanner;

    public class TestQuestion1_Memo
   {
       public static void main (String[] args) throws SQLException,IOException
      {
      
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         Zoo DB = new Zoo();
         System.out.println();
      
         char choice = ' '; 
         do
         {         
            System.out.println("\n\n      MENU");
            System.out.println();
            System.out.println("    Option A");
            System.out.println("    Option B");
            System.out.println("    Option C");
            System.out.println("    Option D");
            System.out.println("    Option E");
            System.out.println("    Option F");
            System.out.println("    Option G");
            System.out.println();
            System.out.println("    Q - QUIT");
            System.out.println(" ");
            System.out.print("    Your choice? ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            String sql = "";
            switch(choice)
            {
               case 'A':	// Question 1.1
                  {
                     sql = "SELECT * FROM tblCarnivore ORDER BY FamilyName, ScientificName";  
                  
                     DB.query(sql);
                     break;
                  }
               //=============================================================================
               case 'B':	// Question 1.2
                  {
                     System.out.println("Please type family name  e.g. Canidae");
                     String sX = inKb.readLine();
                     sql = "SELECT ScientificName, GeneralName, EnclosureNo,EnclosureSize FROM tblCarnivore WHERE EnclosureNo LIKE 'ZE%' AND FamilyName = '" + sX + "'";  
                  
                     DB.query(sql);
                     break;
                  }
               //=============================================================================
               case 'C': 	// Question 1.3
                  {
                     sql = "SELECT Endangered, Count(NumAdults+NumYoung) AS CountAnimals FROM tblCarnivore GROUP BY Endangered";  				
                     DB.query(sql);
                     break;
                  }               
               //=============================================================================
               case 'D':	// Question 1.4
                  {
                     sql = "SELECT EnclosureNo, Format(EnclosureSize/(NumAdults+NumYoung),'#.0#') AS SpacePerAnimal FROM tblCarnivore WHERE GeneralName LIKE '%mongoose%'";  
                     DB.query(sql);
                     break;
                  }
               //=============================================================================
               case 'E':	// Question 1.5
                  {	
                     sql = "UPDATE tblCarnivore SET NumYoung = NumYoung + 3 WHERE EnclosureNo = 'ZF1'";  
                  
                     DB.query(sql);
                     break;
                  }
               //=============================================================================
               case 'F':	// Question 1.6
                  {
                     System.out.println("Type day (for example 23)");
                     String sX = inKb.readLine();
                     sql = "SELECT tblCarnivore.EnclosureNo, GeneralName, VisitDate, ReasonForVisit, Animal_ID FROM tblCarnivore, tblVetVisits WHERE tblCarnivore.EnclosureNo = tblVetVisits.EnclosureNo AND Day(VisitDate) = " + sX ;  
                     DB.query(sql);
                     break;
                  }
               
               //=============================================================================
               case 'G':	// Question 1.7
                  {
                     sql = "INSERT INTO tblVetVisits (VisitDate,EnclosureNo,ReasonForVisit,FollowUp,Animal_ID) VALUES (#2012/10/25#, 'ZD5', 'Ear infection', true,'ZD5_3')";  
                  
                     DB.query(sql);
                     break;
                  }
            }        
         }while (choice != 'Q');  
      
         DB.disconnect();
         System.out.println("Done");  
      }
   }