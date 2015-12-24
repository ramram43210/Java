public class RunTimePolymorphismDemo
{

	public static void main(String[] args)
	{
		Vehicle vehicle = new Vehicle();
		vehicle.drive();

		vehicle = new Car();
		vehicle.drive();

		vehicle = new Truck();
		vehicle.drive();

		// Compile time error
		// vehicle.load();

		Truck truck = new Truck();
		truck.load();
	}

}
