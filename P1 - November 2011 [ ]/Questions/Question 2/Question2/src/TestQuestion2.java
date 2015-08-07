import java.util.Scanner;

public class TestQuestion2
{
	
	public static void main(String args[]) throws Exception
	{	
	    String accountNumber = "AC-23245";
	    int members = 4;    
	    int [] arrWaterUse =  {481, 128, 434, 253, 331, 366, 132};
				
		Scanner input = new Scanner(System.in);
		char ch = ' ';
		while (ch != 'Q')
		{
			System.out.println();
			System.out.println("         Menu");
			System.out.println(" ");
			System.out.println("       Option A "); 
			System.out.println("       Option B "); 
			System.out.println("       Option C "); 
			System.out.println(" ");
			System.out.println("       Q - QUIT");
			System.out.println(" ");
			System.out.print("       Your choice? ");
		
			ch = input.nextLine().toUpperCase().charAt(0);
		
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
 
				case 'C':
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