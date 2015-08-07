   import java.util.Scanner;   
   import java.io.*;
   import javax.swing.*;

    public class TestDistances 
   {
	  static Scanner inKb = new Scanner (System.in);
      static String[] arrEntries = new String[12];
     
   
       public static void main(String[] args) throws Exception
      {
         arrEntries[0]  ="12,15:02h00";
         arrEntries[1]  = "13,10:05h00";
         arrEntries[2]  = "9,20:06h00";
         arrEntries[3]  = "10,15:09h00";
         arrEntries[4] = "7,8:10h00";
         arrEntries[5]  = "10,10:11h00";
         arrEntries[6]  = "12,18:14h00";
         arrEntries[7]  = "7,18:17h00";
         arrEntries[8]  = "11,7:19h00";
         arrEntries[9]  = "10,10:20h00";
         arrEntries[10] = "2,1:23h00";
         arrEntries[11] = "12,17:24h00";
      
      
         Scanner input = new Scanner(System.in);
         
       
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
            
             
            ch = input.nextLine().toUpperCase().charAt(0);
            Position position = new Position();
            switch (ch)
            {
               case 'A':
                  {                   
                     int distance;
                     String time;   
                     int waterX = 10;
                     int waterY = 10;
                     System.out.println("Distances from the watering hole"); 
                     System.out.printf("%-10s%-10s%8s%6s\n","Time","Distance(km)","X-pos", "Y-pos");  
                     for (int k= 0;k<12;k++)
                     {
                        position.getXY(arrEntries[k]);
                        int xPos = position.getX();
                        int yPos = position.getY();
                            
                        distance =  (int)Math.sqrt(Math.pow((xPos - waterX  ),2) + Math.pow((yPos - waterY ),2)); 
                        time = position.getTime(arrEntries[k]); 
                        System.out.printf("%-10s%3s%15d%6d\n",time,distance,xPos, yPos); 
                     }   
                  
                     break;
                  }
                
               case 'B':
                  {
						  
                     System.out.print("\nEnter the number of different types of animals in the group: ");
                     int n = inKb.nextInt();
                     for (int i = 1; i <= n; i++)
                     {
							   inKb.nextLine(); 
								System.out.println();
                        System.out.print("\nEnter animal type "+i+": ");
                        String animal = inKb.nextLine();
                     
                        System.out.print("Enter the number of " + animal + " in the group: ");
                        int number = inKb.nextInt();
                     
                        String tag = "";
                        tag = animal.substring(0,2);
                        int lengthAnimalType = animal.length();
								int randomNum;
                        tag = tag + animal.charAt(lengthAnimalType - 1);
								do
								{
                         randomNum = (int)(Math.random() * 900 + 100);
								}
								while(randomNum % 2 !=0);
                        tag = tag + randomNum;
								System.out.println();
                        System.out.printf("%-20s%-20s",animal,"Tag number");
                        System.out.println();   
                        for (int j = 1; j<= number; j++)
                        {
                           System.out.printf("%-20s%-20s",j+".",tag+"-"+j);
                           System.out.println();   
                        }
                     
                     }
                  
                     break; 
                  }
                
                        
               case 'Q':
                  {
                     System.exit(0);
                  } // case
                    
            } // switch
                
         } // while          
      }
   
    
   
   
   }
