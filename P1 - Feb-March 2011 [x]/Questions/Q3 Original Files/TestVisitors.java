 
import java.util.Scanner;   
import java.io.*;
import javax.swing.*;

public class TestVisitors 
{
   static String[] arrLearners = new String[20];
   static String[] arrVisitors = new String[20];
   
   public static void main(String[] args) throws Exception
   {
  	arrLearners[0] = "Susan Thompson,Maths:77";
  	arrLearners[1] = "Eric Ntumba,IT:89";
 	arrLearners[2] =  "Sean Franklin,Accounting:70";
 	arrLearners[3] = "Mohammed Naidoo,Maths:68";
  	arrLearners[4] =  "Rowan Huntley,IT:77";
  	arrLearners[5] =  "Elizabeth Xaba,Economics:77";
  	arrLearners[6] =  "Sue Daniels,IT:69";
  	arrLearners[7] =  "Zane Shameez,Maths:9";
  	arrLearners[8] =  "Mpho Anderson,Science:81";
  	arrLearners[9] =  "Bryan Smith,IT:75";
  	arrLearners[10]=  "Christopher Khumalo,Accounting:78";
 	arrLearners[11] =  "Camilla Johnson,Science:88";
 	arrLearners[12] =  "Taryn Peterson,Science:70";
  	arrLearners[13] =  "Jack Nelson,Maths:68";
  	arrLearners[14] =  "Joe Zimmerman,Science:76";
  	arrLearners[15] =  "Gregory Thompson,IT:87";
  	arrLearners[16] =  "Dwane Franklin,IT:89";
  	arrLearners[17] =  "Sean Franklin,Accounting:70";
  	arrLearners[18] =  "Mohammed Naidoo,Maths:68";
  	arrLearners[19] =  "Cindy Mokoena,IT:70";

   int count = 0;
   for (int k = 0; k < 20; k++)
    {
  
  	     int comma = arrLearners[k].indexOf(','); 
        String name = arrLearners[k].substring(0,comma);
		 
		
		 int colon = arrLearners[k].indexOf(':'); 
       String subject = arrLearners[k].substring(comma + 1,colon );
      
		 int mark = Integer.parseInt(arrLearners[k].substring(colon + 1));
		 if(((subject.equals("Maths")) || (subject.equals("Science")) || (subject.equals("IT"))) && (mark >= 70)) 
         {
                      arrVisitors[count] = name;
							 count++;

         }
     }
     
     Scanner input = new Scanner(System.in);
         
       
            char ch = ' ';
            while (ch != 'Q')
            {
            
                System.out.println();
                System.out.println("            MENU");
                System.out.println(" ");
                System.out.println("        A - Option A");
                System.out.println("        B - Option B"); 
                System.out.println(" ");
                System.out.println("        Q - QUIT");
                System.out.println(" ");
                System.out.print("        Your Choice? ");
            
             
               ch = input.nextLine().toUpperCase().charAt(0);
					
					 switch (ch)
                {
                    case 'A':
                    {                   
         					 sort(arrVisitors, count);                
								 System.out.println(" ");
                         System.out.println("Alphabetically Sorted List of Visitors"); 
                         System.out.println("======================================");  
                         for (int  k= 0;k < count;k++)
                         {
                            System.out.println(arrVisitors[k]); 
                            }   
       
                        break;
                    }
                
                    case 'B':
                    {
                        sort(arrVisitors, count);
							   System.out.println(" ");	
                        System.out.println("List of Visitors with Student Numbers");
							   System.out.println("=======================================");	
                        System.out.printf("%-25s%-10s\n","Name","Student Number"); 
								System.out.println("=======================================");
								String number; 
                         for (int k = 0;k < count;k++)
                         {
                             number = "";
      							  for (int j = 0; j < arrVisitors[k].length();j++)
   									{  
										char letter = arrVisitors[k].toUpperCase().charAt(j);
	          						if (!(letter =='A')&& !(letter=='E')&& !(letter=='I')&& !(letter=='O')&& !(letter=='U')&& !(letter==' '))
           								number = number + letter;
      								}
     								 number = number.substring(0,3) ;
     								 number = number + (int) (Math.random () * (900) + 100); 
     								 
    						    
 
                             System.out.printf("%-25s%-10s\n",arrVisitors[k],number); 
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
	
public static void sort(String [] arrNames, int count)
{  
  for (int k = 0; k < count -1; k++)
    for (int j = k + 1; j < count; j++)
		{
         if (arrNames[k].compareTo(arrNames[j]) > 0)
			  {
           String temp = arrNames[k];
            arrNames[k] = arrNames[j];
            arrNames[j] = temp;
          }
		}
}
  
    
  
   
}
