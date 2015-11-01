/**
 * Dog class is the blueprint from which individual dog objects can be created.
 */
public class Dog
{
	private String name;
	private String color;
	private String height;
	private String length;
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

	public String getHeight()
	{
		return height;
	}

	public void setHeight(String height)
	{
		this.height = height;
	}

	public String getLength()
	{
		return length;
	}

	public void setLength(String length)
	{
		this.length = length;
	}

	public String getWeight()
	{
		return weight;
	}

	public void setWeight(String weight)
	{
		this.weight = weight;
	}

	public void sit(String string)
	{
		System.out.println(string);
	}

	public void layDown(String string)
	{
		System.out.println(string);
	}

	public void shake(String string)
	{
		System.out.println(string);
	}

	public void walk(String string)
	{
		System.out.println(string);
	}
}