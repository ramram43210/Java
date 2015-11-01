public class Car
{

	private String color;
	private int maxSpeed;

	public Car(String color, int maxSpeed)
	{
		super();
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getMaxSpeed()
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}

	public void carInfo()
	{

		System.out.println("Car Color= " + color + ", Max Speed= " + maxSpeed);

	}
}