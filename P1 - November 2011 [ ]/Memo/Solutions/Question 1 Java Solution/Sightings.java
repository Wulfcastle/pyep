   import java.sql.*;
   import java.io.*;
   import java.util.*;
   import javax.swing.JOptionPane;
   
    public class Sightings   {
      Connection conn;
               
   
       public Sightings ()
      {
      //load the driver
         try
         {
            Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println ("Driver successfully loaded");
         }
             catch (ClassNotFoundException c)
            {
               System.out.println ("Unable to load database driver");
            }      
      
      	 //connect to the database
         try
         {   
          
            String filename = "SightingsDB.mdb";
          
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
         
            System.out.println ("Connection to database successfully established");
         
         }
             catch (Exception e)
            {
               System.out.println ("Unable to connect to the database");
            }
         
      } //end connect
    
       public void A (String sql) throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
        
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-15s%-24s%-15s%-15s%-12s%-15s","SightingID","SightingDate","Animal", "NumAnimals","Young", "RangerID");  
         System.out.println();
         System.out.println("===========================================================================================");  
         
         while (rs.next ())
         {
            int sId = rs.getInt ("SightingID");
            String sDate = rs.getString ("SightingDate");
            sDate = sDate.substring(0,10);
            String sAnimal = rs.getString ("Animal");
            int numAnimals = rs.getInt ("NumAnimals");
            boolean young = rs.getBoolean("Young");
            String yng = "True";
            if (young== false) 
            {yng = "False";}
            String rangerID = rs.getString("RangerID");
                      
            System.out.printf("%-15s%-24s%-15s%-15s%-12s%-15s",sId ,sDate,sAnimal, numAnimals,yng, rangerID);
            System.out.println();        
         }
          
         System.out.println(" ");
         rs.close();  
         stmt.close ();
      } 
   
       public void B (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.println("Animal");  
    
         System.out.println("==========");  
         while (rs.next ())
         {
            String sAnimal = rs.getString ("Animal");
            System.out.println(sAnimal);
               
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
   
       public void C (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-15s%-20s%-20s%-20s","RangerID","Name","Surname","TotalYears");  
         System.out.println();
         System.out.println("==================================================================");  
         while (rs.next ())
         {
            String rangerID = rs.getString ("RangerID");
            String name = rs.getString ("Name");
            String surname = rs.getString ("Surname");
            int years = rs.getInt ("TotalYears");
            System.out.printf("%-15s%-20s%-20s%-20s",rangerID,name,surname,years);  
            System.out.println();
               
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      
      } 
   
    
     
       public void D(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-20s%-20s","Animal","AvgSighted");  
         System.out.println();
         System.out.printf("==============================="); 
         System.out.println(); 
         while (rs.next ())
         {           
            String animal = rs.getString ("Animal");
            double average = rs.getDouble("AvgSighted");
            
                   
            System.out.printf("%-20s%-20s",animal, average);
            System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      } 
                        	
       public void E(String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
      
         int rows = stmt.executeUpdate (sql);
         
         System.out.println(rows + " record deleted");
          
         stmt.close ();
      }
      
      public void F(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         int rows = stmt.executeUpdate (sql);
         
         System.out.println(rows + " records updated");         
         stmt.close ();
      }
   	
       public void G (String sql) throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
        
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-20s%-20s%-20s","SightingDate","Name","Surname");  
         System.out.println();
         System.out.println("==================================================");  
         
         while (rs.next ())
         {
            String sDate = rs.getString ("SightingDate");
            sDate = sDate.substring(0,10);
         
            String name = rs.getString ("Name");
            String surname = rs.getString ("Surname");
                                  
            System.out.printf("%-20s%-20s%-20s",sDate,name,surname);
            System.out.println();        
         }
          
         System.out.println(" ");
         rs.close();  
         stmt.close ();
      } 
   
   
   	
   
       public void disconnect () throws SQLException
      {
      
         conn.close ();
      }
   
   }
       
  
