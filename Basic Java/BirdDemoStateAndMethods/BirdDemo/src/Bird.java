/**
 * Bird class is the blueprint from which individual bird objects can be
 * created.
 */
public class Bird
{
	private String name;
	private String color;
	private String canSwim;
	private String avgLifeTime;
	private String weight;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getCanSwim()
	{
		return canSwim;
	}

	public void setCanSwim(String canSwim)
	{
		this.canSwim = canSwim;
	}

	public String getAvgLifeTime()
	{
		return avgLifeTime;
	}

	public void setAvgLifeTime(String avgLifeTime)
	{
		this.avgLifeTime = avgLifeTime;
	}

	public String getWeight()
	{
		return weight;
	}

	public void setWeight(String weight)
	{
		this.weight = weight;
	}

	public void fly(String string)
	{
		System.out.println(string);
	}

	public void walk(String string)
	{
		System.out.println(string);
	}

}