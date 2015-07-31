   import java.util.Scanner;   
   import java.io.*;
   import javax.swing.*;
   
   /* The following assignment statements must be used to initialise the array arrEntries:
	
         arrEntries[0] = "12,15:2h00";
         arrEntries[1] = "12,15:5h00";
         arrEntries[2] = "9,21:6h00";
         arrEntries[3] = "10,10:7h00";
         arrEntries[4] = "7,8:10h00";
         arrEntries[5] = "12,18:11h00";
         arrEntries[6] = "9,15:14h00";
         arrEntries[7] = "7,20:17h00";
         arrEntries[8] = "11,7:19h00";
         arrEntries[9] = "10,10:20h00";
         arrEntries[10] = "2,1:23h00";
         arrEntries[11] = "12,18:24h00";
   
   */
   
       public class TestDistances 
		 {
       public static void main(String[] args) throws Exception
      {
              
         Scanner input = new Scanner(System.in);
         
       
         char ch = ' ';
         while (ch != 'Q')
         {
            
            System.out.println();
            System.out.println("             Menu");
            System.out.println(" ");
            System.out.println("             Option A");
            System.out.println("             Option B"); 
            System.out.println(" ");
            System.out.println("             Q - QUIT");
            System.out.println(" ");
            System.out.print("            Your choice? ");
            
             
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
                
                        
               case 'Q':
                  {
                     System.exit(0);
                  } // case
                    
            } // switch
                
         } // while          
      
      } // main method
   
   }  // class




