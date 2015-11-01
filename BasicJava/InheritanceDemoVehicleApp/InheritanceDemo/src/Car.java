/*
 * Super class(Parent)
 */
class Vehicle
{
	String vehicleType;
}

/*
 * Sub class(Child)
 */
public class Car extends Vehicle
{

	String modelType;

	public void showDetail()
	{
		/*
		 * accessing Vehicle class member.
		 */
		vehicleType = "Car"; 
		modelType = "sports";
		System.out.println(modelType + " " + vehicleType);
	}

	public static void main(String[] args)
	{
		Car car = new Car();
		car.showDetail();
	}
}