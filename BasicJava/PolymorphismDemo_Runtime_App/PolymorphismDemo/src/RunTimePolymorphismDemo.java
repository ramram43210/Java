public class RunTimePolymorphismDemo
{

	public static void main(String[] args)
	{
		Vehicle vehicleRef = new Vehicle();
		vehicleRef.drive();

		vehicleRef = new Car();
		vehicleRef.drive();

		vehicleRef = new Truck();
		vehicleRef.drive();

		// Compile time error
		// vehicleRef.load();

		Truck truckRef = new Truck();
		truckRef.load();
	}

}
