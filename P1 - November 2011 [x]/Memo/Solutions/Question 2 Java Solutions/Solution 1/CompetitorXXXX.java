public class CompetitorXXXX
{	
	private String name;
	private int largeGameCount;
	private int smallGameCount;
	private int birdCount;

	public CompetitorXXXX()
	{
	
	}

	public CompetitorXXXX(String Name)
	{
		name = Name;
		largeGameCount = 0;
		smallGameCount = 0;
		birdCount = 0;
	}
	
	public int calculatePoints()
	{
		return largeGameCount * 5 + smallGameCount * 3 + birdCount * 2;
	}
	
   public int totalAnimals()
	{
		return largeGameCount + smallGameCount + birdCount;
	}

	
	public String getName()
	{
		return name;
	}
	
	public String mostSpotted()
	{
		if (largeGameCount > smallGameCount & largeGameCount > birdCount)
		{
			return "Large Game";
		}
		else if (smallGameCount > largeGameCount & smallGameCount > birdCount)
		{
			return "Small Game";
		}
		else
		{
			return "Bird";
		}
	}
	
	public void spotBird()
	{
		birdCount++;
	}
	
	public void spotLarge()
	{
		largeGameCount++;
	}
	
	public void spotSmall()
	{
		smallGameCount++;
	}
	
	
	public String toString()
	{
		String objStr = "Competitor : " + name + "\n";
		objStr = objStr + "Large : " + largeGameCount + "  Small : " + smallGameCount + "  Bird : " + birdCount + "\n";
		objStr = objStr + "Total Animals: \t" + totalAnimals(); 
			
		return objStr;
	}
		
		
}