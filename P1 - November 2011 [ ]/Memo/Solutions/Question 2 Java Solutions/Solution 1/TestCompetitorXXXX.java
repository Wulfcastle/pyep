import javax.swing.*;
import java.io.*;
import java.util.*;

public class TestCompetitorXXXX
{
	
	public static void main(String args[]) throws Exception
	{	
		CompetitorXXXX Competitor = new CompetitorXXXX();
		
		File f = new File("Sightings.txt");
					
		if (!f.exists())
		{
			System.out.println("File not found");
		}
		else
		{
			Scanner sc = new Scanner(f);
			
			String name = sc.nextLine();
	    	Competitor = new CompetitorXXXX(name);
			
			int valid = 0;
			int invalid = 0;
			
			while (sc.hasNextLine())
			{
				String animal = sc.nextLine();
				int bracket = animal.indexOf('(');
			   String animalName = animal.substring(0,bracket); 
			   char letter = animal.charAt(bracket + 1); 
				switch (letter) 
				{
					case 'L' : Competitor.spotLarge(); 
						       valid++; 
						       break;
					case 'S' : Competitor.spotSmall(); 
						       valid++; 
						       break;
					case 'B' : Competitor.spotBird(); 
						       valid++; 
						       break;
					default : System.out.println(animalName + " is not in a valid category"); 
						      invalid++; 
						      break;
				}
			}
			
			System.out.println();
			System.out.println(valid + " valid categories processed");
			System.out.println(invalid + " invalid categories processed");
			
			sc.close();	
		}					
		
		BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
		char ch = ' ';
		while (ch != 'Q')
		{
		
			System.out.println();
			System.out.println("         Menu");
			System.out.println(" ");
			System.out.println("       Option A "); 
			System.out.println("       Option B "); 
			System.out.println(" ");
			System.out.println("       Q - QUIT");
			System.out.println(" ");
			System.out.print("       Your choice? ");
		
			ch = inKb.readLine().toUpperCase().charAt(0);
		
			switch (ch)
			{
				case 'A':
				{
					System.out.println();
					System.out.println(Competitor.toString());
					break; 
				}
			
				case 'B':
				{
					PrintWriter fout = new PrintWriter(new File(Competitor.getName() + ".txt"));
					
					fout.println("Competitor : " + Competitor.getName());
					fout.println("Total Animals : " + Competitor.totalAnimals());
					fout.println("Points : " + Competitor.calculatePoints());
					fout.println("Most Sighted Category : " + Competitor.mostSpotted());
					
					fout.close();
					
					System.out.println();
					System.out.println("Results Successfully Written to File");
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