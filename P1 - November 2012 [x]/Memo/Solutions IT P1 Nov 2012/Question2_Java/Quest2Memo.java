//Solution for class - Question 2
    public class Quest2Memo 
   {
      private String	type;
      private int	numOfAn;
      private double	cSize;
      private char cat;
   
       public Quest2Memo(String type, int numOfAn, double	cSize, char	cat)
      {
         this.type =	type;
         this.numOfAn =	numOfAn;
         this.cSize = cSize;
         this.cat	= cat; 
      }
   	
       public boolean	isSuitable(char cat,	int number)
      {
         boolean	suitable	= false;
         double space = 0;
         if (type.equalsIgnoreCase("XXX")) 
         {
            space	= cSize / number;
          
            if (cat =='L' && space >= 18)
               suitable  = true;
         											  
            if (cat ==  'M'	&&	(space >= 12 && space <	18))
               suitable =	true;
         					
            if (cat ==  'S'	&&	(space >= 7 && space < 12))
               suitable =	true;
         }
         return	suitable; 
      }

       public String	toString()
      {
         return	type + "..." +	cat +	"\nEnclosure size: " +	cSize	+ "\nNumber	of	animals:	" + numOfAn	+ "\n\n";		  
      }
   	 
       public void	setAType(String type) {
         this.type =	type;
      }
   			  
       public void setNumOfAn(int numOfAn) {
         this.numOfAn =	numOfAn;
      }
   												
       public void	setCSize(double cSize) {
         this.cSize = cSize;
      }
   	
       public void setCat(char cat)	{
         this.cat	= cat;
      }
    
       public String getAType() {
         return type;
      }
   	 
       public int	getNumOfAn() {
         return numOfAn;
      }
   
       public double	getCSize() {
         return cSize;
      }
   	  
       public char getCat() {
         return cat;
      }
   	 
   }