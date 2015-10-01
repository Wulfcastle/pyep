import javax.swing.*;
import java.io.*;
import java.util.*;

public class TestCity
{
    public static String degreeJobs[] = {"Doctor", "Programmer", "Architect", "Teacher", "Lawyer", "Engineer"};
    public static String diplomaJobs[] = {"Secretary", "Mechanic", "Electrician", "Beautician", "Nurse", "Plumber"};
    
    public static String jobCategory(String job)
    {
        String jobType = "Error";
        
        for(int i = 0; i < 6; i++)
        {
            if (degreeJobs[i].equals(job))
            {
                jobType = "Degree";
            }
            else if (diplomaJobs[i].equals(job))
            {
                jobType = "Diploma";
            }			
        }
        
        return jobType;	
    }
    
    public static void main(String args[]) throws Exception
    {	
        City city = new City(); 
        
        File f = new File("Jobs.txt"); 
                    
        if (!f.exists()) 
        {
            System.out.println("File not found"); 
        }
        else
        {
            Scanner sc = new Scanner(f); 
            
            String sCity = sc.nextLine();
            city = new City(sCity); 		
            
            int counter = 0; 
            
            while (sc.hasNextLine()) 
            {
                String job = sc.nextLine(); 
                double salary = Double.parseDouble(sc.nextLine()); 
                
                String jobType = jobCategory(job); 
            
                if (jobType.equals("Degree"))
                {
                    city.addDegJob(salary); 
                }
                else if (jobType.equals("Diploma"))
                {
                    city.addDipJob(salary); 
                }	
                    
                counter++; 				
            }	
            
            System.out.println(counter + " job opportunities processed from " + city.getCityName()); 
            
            System.out.println();
            sc.close();	
        }					
        
        BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
        char ch = ' ';
        while (ch != 'Q')
        {
        
            System.out.println();
            System.out.println("             MENU");
            System.out.println(" ");
            System.out.println("         A - Option A"); 
            System.out.println("         B - Option B"); 
            System.out.println(" ");
            System.out.println("         Q - QUIT");
            System.out.println(" ");
            System.out.print("         Your Choice? ");
        
            ch = inKb.readLine().toUpperCase().charAt(0);
        
            switch (ch)
            {
                case 'A':
                {
                    System.out.println();
                    System.out.println(city.toString()); 
                    break; 
                }
            
                case 'B':
                {
                    System.out.print("Enter your qualification (Degree/Diploma) : ");
                    String qual_type = inKb.readLine();
                    System.out.print("Enter your minimum required salary : ");
                    double money = Double.parseDouble(inKb.readLine());
                    
                    if (city.jobMatch(money, qual_type))
                    {
                        System.out.println(city.getCityName() + " is a good place to look for a job");
                    }
                    else
                    {
                        System.out.println(city.getCityName() + " does not meet your minimum requirements");
                    }
                    
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