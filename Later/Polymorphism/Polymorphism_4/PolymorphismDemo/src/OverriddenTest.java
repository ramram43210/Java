class Vehicle
{
	public void move()
	{
		System.out.println("Vehicles can move");
	}

}

class Car extends Vehicle
{
	public void move()
	{
		System.out.println("Car can move very fast");
	}

}

public class OverriddenTest
{

	public static void main(String[] args)
	{
		Vehicle vh = new Car();

		vh.move(); // prints Car can move very fast

		vh = new Vehicle();

		vh.move(); // prints Vehicles can move"
	}

}
