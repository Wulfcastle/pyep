   public class Household
   {   
      private String account;
      private int members;
   	private int [] arrWaterUse;
              
      public Household()
      {
      
      }
   
      public Household(String Account, int Members, int[]arrWater)
      {
  
  		}
   
          
      public boolean determineHighRisk(double dayLimit)
      {
                
         return false;
      			 
      }
    
         
                    
      public String toString()
      {
         String objStr = "Account number: " + account  + "Number of members: " + members;
         return objStr;
      }
        
        
   }
