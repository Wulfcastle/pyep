   import java.util.Scanner;   
   import java.io.*;
   import javax.swing.*;

    public class TestDistances 
   {
      Scanner inKb = new Scanner (System.in);
      String [] arrEntries = new String [12];
   
       public TestDistances()
      {
         arrEntries[0]  ="12,15:02h00";
         arrEntries[1]  = "13,10:05h00";
         arrEntries[2]  = "9,20:06h00";
         arrEntries[3]  = "10,15:09h00";
         arrEntries[4]  = "7,8:10h00";
         arrEntries[5]  = "10,10:11h00";
         arrEntries[6]  = "12,18:14h00";
         arrEntries[7]  = "7,18:17h00";
         arrEntries[8]  = "11,7:19h00";
         arrEntries[9]  = "10,10:20h00";
         arrEntries[10] = "2,1:23h00";
         arrEntries[11] = "12,17:24h00";
      }
      
   
       public void displayDistances()
      {
         int waterX = 10;
         int waterY = 10;
         int xPos;
         int yPos;
         int distance;
         String time;
         System.out.println();
         System.out.println("Distances from the watering hole");
         System.out.printf("%-10s%-15s%-10s%-10s","Time","Distance(km)","X-pos","Y-pos");
         System.out.println();
         for (int i=0;i<12;i++)
         {
            String line = arrEntries[i];
            int psnComma = line.indexOf(','); 
            xPos = Integer.parseInt(line.substring(0,psnComma)); 
            int psnColon = line.indexOf(':'); 
         
            yPos = Integer.parseInt(line.substring(psnComma + 1,psnColon)); 
            time = line.substring(psnColon+1); 
            distance =  (int)Math.sqrt(Math.pow((xPos - waterX  ),2) + Math.pow((yPos - waterY ),2)); 
         
            System.out.printf("%-15s%-10s%-10s%-10s",time,distance,xPos,yPos);
            System.out.println();
         
         
         }
      
      
      }
    
    
       public void tags()
      {
         
         System.out.print("Enter the number of different types of animals in the group : ");
         int n = inKb.nextInt();
         for (int i = 1; i <= n; i++)
         {
            inKb.nextLine();
            System.out.println();
         
            System.out.print("Enter the name of animal type "+ i + " : ");
            String animal = inKb.nextLine();
            System.out.print("Enter the number of animals of type " + i + " in the group : ");
            int number = inKb.nextInt(); 
           
            String   tag = animal.substring(0,2);
            tag = tag + animal.charAt(animal.length() - 1);
            int randomNum;
            do
            {
               randomNum = (int)(Math.random() * 900 + 100);
            }
            while (randomNum % 2 !=0);
            tag = tag + randomNum;
            System.out.println(); 
            System.out.printf("%-20s%-20s",animal,"Tag number");
            System.out.println();   
            for (int j = 1; j<= number; j++)
            {
               System.out.printf("%-20s%-20s",j+".",tag + "-" +j);
               System.out.println();   
            }
         
         }
               
      }
   
   
       public static void main(String[] args) throws Exception
      {
              
         Scanner input = new Scanner(System.in);
         TestDistances obj = new TestDistances();
       
         char ch = ' ';
         while (ch != 'Q')
         {
            
            System.out.println();
            System.out.println("        Menu");
            System.out.println(" ");
            System.out.println("      Option A ");
            System.out.println("      Option B "); 
           
            System.out.println(" ");
            System.out.println("      Q - QUIT");
            System.out.println(" ");
            System.out.print("      Your choice? ");
            
                
             
            ch = input.nextLine().toUpperCase().charAt(0);
            System.out.println(" ");  
            switch (ch)
            {
               case 'A':
                  {                   
                     obj.displayDistances();
                     break;
                  }
                
               case 'B':
                  {
                     obj.tags();  
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
