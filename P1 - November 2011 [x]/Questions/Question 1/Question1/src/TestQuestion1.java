import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.util.Scanner;

public class TestQuestion1
{
	public static void main (String[] args) throws SQLException,IOException
	{
	
		BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
		
		Dams DB = new Dams();
		System.out.println();
		
		char choice = ' '; 
		do
		{         
            System.out.println("      MENU");
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
					sql = "";
					
					DB.query(sql);
					break;
				}
		//=============================================================================
           	case 'B':	// Question 1.2
				{
					sql = "";  
					
					DB.query(sql);
					break;
				}
		//=============================================================================
				case 'C': 	// Question 1.3
				{
					sql = "";  
					
					DB.query(sql);
					break;
				}               
		//=============================================================================
				case 'D':	// Question 1.4
				{
					sql = "";  
					
					DB.query(sql);
					break;
				}
		//=============================================================================
  				case 'E':	// Question 1.5
				{	
					sql = "";  
					
					DB.query(sql);
					break;
				}
		//=============================================================================
				case 'F':	// Question 1.6
				{
					sql = "";  
					
					DB.query(sql);
					break;
				}
		//=============================================================================
 				case 'G':	// Question 1.7
				{
					sql = "";  
					
					DB.query(sql);
					break;
				} 			
		
			}        
		}while (choice != 'Q');  
		
		DB.disconnect();
		System.out.println("Done");  
	}
}