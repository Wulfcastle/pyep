public class City 
{
    // 2.1.1 (3)
    private String cityName;
    private int degreeJobs;
    private int diplomaJobs;
    private double salaryTotal;
    
    public City() 
    {
        
    }
    
    // 2.1.2 (3)
    public City(String name) 
    {
        cityName = name;
        
        degreeJobs = 0;
        diplomaJobs = 0;
        salaryTotal = 0;    	
    }
        
    // 2.1.3 (5)
    public void addDipJob(double salary)
    {
        diplomaJobs++;
        salaryTotal = salaryTotal + salary;
    }
    
    public void addDegJob(double salary)
    {
        degreeJobs++;
        salaryTotal = salaryTotal + salary;
    }
    
    public double averageSalary()
    {
        double salary = Math.round(salaryTotal / (degreeJobs + diplomaJobs) * 100) / 100.0;
        return salary;
    }   
    
    // 2.1.4 (2)
    public String getCityName()
    {
        return cityName;
    }
    
    // 2.1.5 (5)	
    public boolean jobMatch(double sal, String type)
    {
        if (type.equalsIgnoreCase("degree") & degreeJobs > diplomaJobs & averageSalary() > sal)
        {
            return true;
        }
        else if (type.equalsIgnoreCase("diploma") & diplomaJobs > degreeJobs & averageSalary() > sal)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // 2.1.6 (4)
    public String toString()
    {
       String objStr = "";
        
       objStr = objStr + "City : " + cityName + "\n";
       objStr = objStr + "Diploma Jobs : " + diplomaJobs + "\t" + "Degree Jobs : " + degreeJobs + "\n";
       objStr = objStr + "Average Salary : R " + averageSalary() + "\n";
                
       return objStr;
    }
}