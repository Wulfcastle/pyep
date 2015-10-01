
public class Position
{
   private int xPos, yPos; 
   public Position()
    {
    }
    
    public void getXY(String line)
    {
        int comma = line.indexOf(','); 
        xPos = Integer.parseInt(line.substring(0,comma)); 
		  int colon = line.indexOf(':'); 

        yPos = Integer.parseInt(line.substring(comma + 1,colon)); 
    }
    
    public int getY()
    {
        return yPos;
    }
    
    public int getX()
    {
        return xPos;
    }
    
  
    public String getTime(String line)
    {
        int pos = line.indexOf(':'); 
        return line.substring(pos + 1,line.length()); 
    }
    

        
}
