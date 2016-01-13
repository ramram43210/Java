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
		Vehicle vehicleRef = new Car();

		vehicleRef.move(); // prints Car can move very fast

		vehicleRef = new Vehicle();

		vehicleRef.move(); // prints Vehicles can move"
	}

}
