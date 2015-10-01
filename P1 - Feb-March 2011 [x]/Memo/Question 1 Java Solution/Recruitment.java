   import java.sql.*;
   import java.io.*;
   import java.util.*;
   import javax.swing.JOptionPane;
   
    public class Recruitment   {
      Connection conn;
               
   
       public Recruitment()
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
          
            String filename = "RecruitmentDB.mdb";
          
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
         System.out.printf("%-25s%-22s%-15s%-20s","AgencyName","Province", "International","NumPrevPlacements");  
         System.out.println();
         System.out.println("=================================================================================");  
         
         while (rs.next ())
         {
            String name = rs.getString ("AgencyName");
            String province = rs.getString ("Province");
            boolean international = rs.getBoolean("International");
            String check = "True";
            if (international== false) 
            {check = "False";}
            int numPrevPlaces = rs.getInt("NumPrevPlacements");
                      
            System.out.printf("%-25s%-22s%-15s%-20s",name,province,check,numPrevPlaces);
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
         System.out.printf("%-25s%-25s%-20s","Name","Surname","Salary");  
         System.out.println();
         System.out.println("=========================================================");  
      
         while (rs.next ())
         {
            String name = rs.getString ("Name");
            String sname = rs.getString("Surname");
            double salary = rs.getInt("Salary");
            System.out.printf("%-25s%-25s%-20.0f",name,sname,salary);  
            System.out.println();
         
               
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
   
       public void C (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         int countInternational=0; 
         while (rs.next ())
         {
            countInternational=rs.getInt("Count");               
         } 
         System.out.println("The number of agencies that offer international jobs are:"+countInternational); 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      
      } 
   
    
     
       public void D(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-20s%-20s%-20s%-20s","Name","Surname","Salary","AgentComm");  
         System.out.println();
         System.out.printf("======================================================================"); 
         System.out.println(); 
         while (rs.next ())
         {           
            String name = rs.getString ("Name");
            String surname = rs.getString ("Surname");
            double salary = rs.getDouble("Salary");
            double agentComm = rs.getDouble("AgentComm");
            
                   
            System.out.printf("%-20s%-20s%-20.0f%-20.2f",name,surname,salary,agentComm);  
            System.out.println();
         
         } 
         System.out.println(" ");  
         stmt.close ();
      } 
        
               	
       public void E(String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
      
         int rows = stmt.executeUpdate (sql);
         
         System.out.println(" Record inserted successfully");
         System.out.println(); 
         stmt.close ();
      }
        
       public void F(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-15s%-15s%-25s%-20s","Name","Surname","AgencyName","Province");  
         System.out.println();
         System.out.printf("========================================================================"); 
         System.out.println(); 
         while (rs.next ())
         {           
            String name = rs.getString ("Name");
            String surname = rs.getString ("Surname");
            String agencyName = rs.getString("AgencyName");
				String province = rs.getString("Province");

            System.out.printf("%-15s%-15s%-25s%-20s",name,surname,agencyName,province);  
            System.out.println();         
         } 
         System.out.println(" ");  
         stmt.close ();
      }
   	
       public void G  (String sql) throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-20s%-20s%-20s","Name","Surname","DatePlaced");  
         System.out.println();
         System.out.println("==================================================");  
         
         while (rs.next ())
         {
            String name = rs.getString ("Name");
            String surname = rs.getString ("Surname");
                        
				String sDate = rs.getString ("DatePlaced");
            sDate = sDate.substring(0,10);
         
        
            System.out.printf("%-20s%-20s%-20s",name,surname,sDate);
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
       
  
