//Solution for test class Question 2
   import java.io.*;
 	import java.util.Scanner;

    public class TestQuestion2Memo {
        
      static Quest2Memo[] enclosures = new Quest2Memo[30]; 
		static int cnt; 
   
       public static void main(String[] args) throws Exception 
      {
         BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
         readFile();
        
         char choice = ' ';
         do {
            System.out.println("    MENU");
            System.out.println();
            System.out.println("  Option A");
            System.out.println("  Option B");
            System.out.println();
            System.out.println("  Q - QUIT");
            System.out.println("\n  Your choice?  ");
            choice =kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
               case 'A':                   
                  display();
						break;
               case 'B':
                  optionB();
                  break;
               case 'Q':
                  System.out.println("Quit");
            }
         } while (choice != 'Q');
      }
   
       public static void readFile() {
         try 
         {
				cnt = 0;
            Scanner sc = new Scanner (new FileReader("DataQ2.txt"));
            while (sc.hasNext())
	          {
               String line = sc.nextLine();
					int pos1 = line.indexOf(';',0);   
				   String aType = line.substring(0,pos1);
					
					int posHash = line.indexOf('#',pos1);          
               int numberAn = Integer.parseInt(line.substring(pos1 + 1,posHash));  
					 
					int pos2 = line.indexOf(';',posHash);        
               double cSize = Double.parseDouble(line.substring(posHash + 1,pos2));
					
					int posHash2 = line.indexOf('#',pos2); 
					char cat = line.charAt(posHash2-1);
					
					enclosures[cnt] = new Quest2Memo(aType, numberAn,cSize, cat);
					cnt++;
            }
				sc.close();
         } 
             catch (FileNotFoundException e) {
               System.out.println("File does not exist");
               System.exit(0);
            } 
             catch (Exception f) {
               System.out.println(f);
            }
      }
   
       public static void display() {
         System.out.println("List of all enclosures");
         System.out.println("======================");   
      
         for (int k = 0; k < cnt; k++) {
            System.out.println("Enclosure number: " + (k+1)+"\n" + enclosures[k].toString());
         }                                                   
      }
   
       private static  void optionB() throws Exception {
         BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
      
         boolean found = false;
         int count = 0;
                               
         System.out.println("Enter the type of animal (for example Tiger)");
         String animal = kb.readLine();      
         System.out.println("Enter the number of animals (for example 2)");
         int numA = Integer.parseInt(kb.readLine());
         System.out.println("Enter the Category (L/M/S)");
         char cat = kb.readLine().charAt(0);                
        		                         
         while (found == false && count < cnt)                          
         {
            if (enclosures[count].isSuitable(cat, numA))
			   {
       			found = true;      
			      enclosures[count].setAType(animal);                 
               enclosures[count].setNumOfAn(numA);                    
               enclosures[count].setCat(cat);                
            }
				else
				  count++; 
			}
         if (found == false)
           {
            System.out.println("No suitable enclosure was found");           
           }
			else
			{
			 System.out.println("\n\nThese animals were placed in enclosure number " + (count +1 ));
          System.out.println("\n");
			 display();
			 }
      }
  }       
  