   import java.io.*;
   import java.sql.*;
   import javax.swing.*;
   import java.util.Scanner;

    public class TestRecruitment
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         Recruitment DB = new Recruitment();
         System.out.println();
      
         char choice = ' '; 
         do
         {         
            System.out.println("        MENU");
            System.out.println();
            System.out.println("      Option A");
            System.out.println("      Option B");
            System.out.println("      Option C");
            System.out.println("      Option D");
            System.out.println("      Option E");
            System.out.println("      Option F");
            System.out.println("      Option G");
            System.out.println();
            System.out.println("      Q - QUIT");
            System.out.println(" ");
            System.out.print("     Your Choice? ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            String sql = "";
            switch(choice)
            {
               case 'A':
                  {
                     sql = "SELECT * FROM tblAgencies ORDER BY NumPrevPlacements DESC";                    					
                     DB.A(sql); 
                     break;
                  }
               case 'B':
                  {
                     sql = "SELECT Name, Surname, Salary FROM tblClients WHERE FullTime = False AND Salary < 15000";  
                  					 
                     DB.B(sql);  
                     break;
                  }
               case 'C':
                  { 
                     sql = "SELECT Count(*)AS [Count] FROM tblAgencies WHERE International = True";					
                     DB.C(sql);   
                     break;
                  }  
               
               
               case 'D':
                  {
                     sql = "SELECT Name,Surname,Salary,round(salary * (10 / 100),2) AS [AgentComm] FROM tblClients";   
                  					
                     DB.D(sql); 
                     break;
                  }  
               
               case 'E':
                  {	
                     Scanner kb = new Scanner (System.in);
                     System.out.println();
                                      
                     sql = "INSERT INTO tblAgencies VALUES ('Jobs Unlimited','Western Cape',False,0)";  
                     DB.E(sql); 
                  	
                     break;  
                  }
               case 'F':
                  {
                     sql = "SELECT Name,Surname,AgencyName,Province FROM tblAgencies, tblClients WHERE tblAgencies.AgencyName = tblClients.PlacedBy AND (Province = 'Western Cape' OR   Province = 'Gauteng')";          					
                     DB.F(sql);
                  	
                     break;
                  } 
               
               case 'G':
                  {
                     Scanner kb = new Scanner (System.in); 
                     System.out.println("Enter the name of the agency ");
                     String agencyName = kb.nextLine();
                     System.out.println("Enter the cut off date");
                     String date = kb.next();
                  
                     sql = "SELECT Name,Surname,DatePlaced FROM tblClients WHERE DatePlaced < #"+date+"# AND PlacedBy = '"+agencyName+"'"; 
                  					
                     DB.G(sql);
                     break;
                  }   
            
            }        
         }while (choice != 'Q');  
      
         DB.disconnect();
         System.out.println("Done");  
      }
   }