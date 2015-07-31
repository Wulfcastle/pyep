import javax.swing.*;
import java.io.*;
import java.util.*;

public class TestCompetitor
{
	
	
	public static void main(String args[]) throws Exception
	{				
		BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
		char ch = ' ';
		while (ch != 'Q')
		{
		
			System.out.println();
			System.out.println("           Menu");
			System.out.println(" ");
			System.out.println("           Option A"); 
			System.out.println("           Option B"); 
			System.out.println(" ");
			System.out.println("           Q - QUIT");
			System.out.println(" ");
			System.out.print("          Your choice? ");
		
			ch = inKb.readLine().toUpperCase().charAt(0);
		
			switch (ch)
			{
				case 'A':
				{
					
					break;
				}
			
				case 'B':
				{

					break; 
				}
				 
 
				case 'Q':
				{
					System.exit(0);
				} // case
				
			} // switch
			
		} // while
		
	} // main
	
} // class