   import javax.swing.*;
   import java.io.*;
   import java.util.*;

    public class TestCompetitorXXXX
   {
      CompetitorXXXX Competitor = new CompetitorXXXX();
       public TestCompetitorXXXX()
      {
         int valid = 0;
         int invalid = 0;
      
         try
         {
            Scanner sc = new Scanner (new FileReader("Sightings.txt"));
            while (sc.hasNext())
            {
                  
               String name = sc.nextLine();
               Competitor  = new CompetitorXXXX(name);
            
                        
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
            
                
            }
            sc.close();						
         }
         
             catch(FileNotFoundException e)
            {
               System.out.println(e.getMessage());
            }
      }
      
       public void display()
      {
         System.out.println();
         System.out.println(Competitor.toString());
      
      }
   
       public void writeToFile()
      {
         try
         {
            PrintWriter fout = new PrintWriter(new FileWriter(Competitor.getName() + ".txt"));
                  
            fout.println("Competitor : " + Competitor.getName());
            fout.println("Total Animals : " + Competitor.totalAnimals());
            fout.println("Points : " + Competitor.calculatePoints());
            fout.println("Most Sighted Category : " + Competitor.mostSpotted());
                  
            fout.close();
                  
            System.out.println();
            System.out.println("Results Successfully Written to File");
         }
             catch(IOException e)
            {
               System.out.println(e.getMessage());
            }
      
      }
       public static void main(String args[]) throws Exception
      {	
      		
         TestCompetitorXXXX obj = new TestCompetitorXXXX();
      
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         char ch = ' ';
         while (ch != 'Q')
         {
         
            System.out.println();
            System.out.println("         Menu");
            System.out.println(" ");
            System.out.println("       Option A"); 
            System.out.println("       Option B"); 
            System.out.println(" ");
            System.out.println("       Q - QUIT");
            System.out.println(" ");
            System.out.print("       Your choice? ");
         
            ch = inKb.readLine().toUpperCase().charAt(0);
         
            switch (ch)
            {
               case 'A':
                  {  
                     obj.display();                   
                     break; 
                  }
               
               case 'B':
                  {
                     obj.writeToFile();
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