   import java.io.IOException;  
   import java.io.BufferedReader;
   import java.io.InputStreamReader;
	 
    public class Question3_Memo
   {
     
	  String[] arrTic = {"RCm158", "ADM33", "RCf250", "RAf5", "BRM32",
	   "ADm236","RCm23", "RDM54", "RCf17", "RAm12", "ADm9", "RCF43",
		 "RDm140", "RDm23", "ACF113", "ABf30", "RDm22", "ARf38", "RCF8",
		 "RAf53", "RCf12", "ABF156", "ADM31", "ADM47", "RAf48", "ABF246",
		  "ABf59", "RRM321", "ABm36", "RCF31","RAm445", "ACn26"};

	  			
      String[] arrDisplay = {"AA","AB","AC","AD","RA","RB","RC","RD"};
      int[] arrPoints = {0,0,0,0,0,0,0,0};
      String[]arrMedal = {"Gold", "Silver", "Bronze"};
   	
      BufferedReader inKb; 
   
         	
   	//============================================================================================
      	// Option A   
	   public void validate()      { 
			System.out.println("Invalid entries");
   		for (int count = 0; count < 32;count++) {
				
   		   Ticket ticket = new Ticket(arrTic[count]);
			   if (ticket.isValid()== false)	{  
							
         		 System.out.println(arrTic[count]);
      			 arrTic[count] = "Z";
      		 }
      	 }
       }
      //==========================================================================================
    	//Option B
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
         System.out.println("The winning ticket: " + arrTic[win -1]);     
      }
   	//==================================================================================
   	// Option C 	
   	// Indentify Medal Winners
       public void getMedalWinners() throws IOException
      {
         //For each display add points:
         for (int d = 0; d < 8; d ++)   {
            for (int t = 0; t < 32; t++)   {
               if( !(arrTic[t].equalsIgnoreCase("Z"))){
                 
					   Ticket ticket = new Ticket(arrTic[t]);
							
						String displayChoice = ticket.getSection() + ticket.getDisplay();
											
						   if (displayChoice.equalsIgnoreCase(arrDisplay[d]))	{
                        arrPoints[d]= arrPoints[d] + ticket.getPointvalue();
                     } //if
               } // if not Z
            }// for ticket
         }// for d
			
      //Sort the two arrays
         for (int a = 0; a < 8 -1; a++)   {
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
         System.out.printf("%-8s%12s%21d\n", arrMedal[a], arrDisplay[a],arrPoints[a]);                        
            							
         }						                  
      }  // getMedalWinners
        
       public void displayMenu() throws IOException
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
   
   }