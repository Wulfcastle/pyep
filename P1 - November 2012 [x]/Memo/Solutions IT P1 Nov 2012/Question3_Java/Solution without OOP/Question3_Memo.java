   import java.io.IOException;  
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	
	public class Question3_Memo
   {
      String[] arrTic =  	{"RCm158", "ADM33", "RCf250", "RAf5",
         "BRM32", "ADm236","RCm23", "RDM54",
         "RCf17", "RAm12", "ADm9", "RCF43",
         "RDm140", "RDm23", "ACF113", "ABf30",
         "RDm22", "ARf38", "RCF8", "RAf53",
         "RCf12", "ABF156", "ADM31", "ADM47",
         "RAf48", "ABF246", "ABf59", "RRM321",
         "ABm36", "RCF31","RAm445", "ACn26"};
   // size 32
      String[] arrDisplay = {"AA","AB","AC","AD","RA","RB","RC","RD"};
      int[] arrPoints = {0,0,0,0,0,0,0,0};
      String[]arrMedal = {"Gold", "Silver", "Bronze"};
   	
      BufferedReader inKb; 
   
         	
   	//============================================================================================
   	// Option A
       public void validate()
      {
         System.out.println("Invalid entries");
         for (int count = 0; count < 32;count++)
         {
            char firstchar = arrTic[count].charAt(0);
            char secondchar = arrTic[count].charAt(1); // String secondchar = arrTic[count].substring(1,2); 
            char thirdchar = arrTic[count].charAt(2);
                
            if ("ABCD".indexOf(secondchar)< 0 ||(firstchar != 'A' && firstchar != 'R' )||("MmFf".indexOf(thirdchar)< 0 ))
            {
               System.out.println(arrTic[count]);
               arrTic[count] = "Z";
            }
         }
      }
      //==========================================================================================
    	//OPTION B
       public void getWinningNumber()
      {
         boolean valid = false;    
         int win = (int)(Math.random() * 32); 
         while (valid == false)
         {
            if(arrTic[win-1].equals("Z"))
            {
               win = (int)(Math.random() * 32);         	    
               System.out.println("Invalid");
            }
            else      
               valid = true;
         }
         System.out.println("The position of the winning ticket in the array: " + win); 
         System.out.println("The winning ticket: " + arrTic[win-1]);     
      }
   	//==================================================================================
   	// OPTION C 	
   	// Indentify Medal Winners
       public void getMedalWinners() throws IOException
      {
       // Write code for Option C
       //For each display add points:
         for (int d = 0; d < 8; d ++)   {
            for (int ticket = 0; ticket < 32; ticket++)   {
               if( !(arrTic[ticket].equalsIgnoreCase("Z"))){
                  String displayChoice = arrTic[ticket].substring(0,2);
                  if (displayChoice.equalsIgnoreCase(arrDisplay[d]))	{
                     char gender = arrTic[ticket].charAt(2);
                     if (gender == 'f' || gender == 'm')
                        arrPoints[d]= arrPoints[d] + 5;
                     else	  
                        arrPoints[d] = arrPoints[d]+ 12;
                  } //if
               } // if not Z
            }// for ticket
         }// for d
			
      //Sort the two arrays >> Any sorting method
         for (int a = 0; a < (8-1); a++)   {
            for (int d = (a+1); d < 8; d++)   {
               if ( arrPoints[a] < arrPoints[d]){
               
                  String tempD = arrDisplay[a];
                  arrDisplay[a]= arrDisplay[d];
                  arrDisplay[d] = tempD;
               
                  int tempP = arrPoints[a];
                  arrPoints[a] = arrPoints[d];
                  arrPoints[d] = tempP;
               } // if
            } // for d
         }	// for a	  
      //display medals
         System.out.println("Medal winning displays:");
         System.out.printf("%s%20s%20s\n","Medal","Display","Points");
         for (int a = 0; a < 3; a ++)   {
            System.out.printf("%-8s%12s%21d\n", arrMedal[a], arrDisplay[a], arrPoints[a]);     							
         }						                  
      }  // getMedalWinners
        
       public Question3_Memo() throws IOException
      {
         inKb = new BufferedReader (new InputStreamReader (System.in));
      
         System.out.println();
      
         char choice = ' '; 
         do
         {         
            System.out.println("\n\n        MENU");
            System.out.println();
            System.out.println("      Option A");
            System.out.println("      Option B");
            System.out.println("      Option C");
            System.out.println();
            System.out.println("      Q - QUIT");
            System.out.println(" ");
            System.out.print("    Your choice? ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            String sql = "";
            switch(choice)
            {
               case 'A':
                  validate();
                  break;
               case 'B':
                  getWinningNumber();
                  break;
               case 'C':                                    
                  getMedalWinners();
                  break;
               case 'Q':
                  System.out.println("QUIT");
                  break;
            }
         }while(choice != 'Q');		      		
      }
   
       public static void main(String[] args) throws IOException
      {
         new Question3_Memo();
      }
   }