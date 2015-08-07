   import java.io.*;
   import java.sql.*;
	import javax.swing.*;
   import java.util.Scanner;

    public class TestSightings
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         Sightings DB = new Sightings();
         System.out.println();
      
         char choice = ' '; 
         do
         {         
            System.out.println("       MENU");
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
            System.out.print("    Your Choice? ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            String sql = "";
            switch(choice)
            {
               case 'A':
                  {
                     sql = "Select * from tblSightings order by SightingID DESC"; // <--- SQL Code for Option A goes here 
                  					
                     DB.A(sql);// This statement passes SQL to display method as parameter
                     break;
                  }
               case 'B':
                  {
                     sql = "Select Distinct Animal from tblSightings where Young = true";// <--- SQL Code for Option B goes here 
                  					 
                     DB.B(sql);// This statement passes SQL to display method as parameter
                     break;
                  }
						
               case 'C':
                  {
                     sql = "Select RangerID, Name, Surname, year(Now()) - year (DateAppointed) as [TotalYears] from tblRangers"; // <--- SQL Code for Option C goes here 
                  					
                     DB.C(sql);// This statement passes SQL to display method as parameter
                     break;
                  }  
               
               
               case 'D':
                  {
                     sql = "Select Animal, round(Avg(NumAnimals),2) AS [AvgSighted] from tblSightings group by Animal"; // <--- SQL Code for Option D goes here 
                  					
                     DB.D(sql);// This statement passes SQL to display method as parameter
                     break;
                  }  
               case 'E':
                  {	
                     Scanner kb = new Scanner (System.in);
                     System.out.println();
                     System.out.println("Enter the ID of the sighting to delete");
                     int id = kb.nextInt();
                  
                     sql = "Delete from tblSightings where SightingID = "+id+""; // <--- SQL Code for Option E goes here 
                  					
                     DB.E(sql);// This statement passes SQL to display method as parameter
							
                     break;  
                  }
               case 'F':
                  {
                     sql = "Update tblSightings set Animal = 'White Rhino' where Animal = 'Rhino'"; // <--- SQL Code for Option F goes here 
                  					
                     DB.F(sql);// This statement passes SQL to display method as parameter
							
                     break;
                  } 
               
               case 'G':
                  {
                     sql = "Select SightingDate,Name,Surname from tblSightings, tblRangers where tblSightings.RangerID = tblRangers.RangerID AND Animal = 'Elephant' AND SightingDate > #30/04/2010#"; // <--- SQL Code for Option F goes here 
                  					
                     DB.G(sql);// This statement passes SQL to display method as parameter
                     break;
                  }   
            
            }        
         }while (choice != 'Q');  
      
         DB.disconnect();
         System.out.println("Done");  
      }
   }