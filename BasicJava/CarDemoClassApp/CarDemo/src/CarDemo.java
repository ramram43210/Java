public class CarDemo
{
	public static void main(String[] args)
	{

		/*
		 * Create maruthiAltok10 car object and 
		 * set the properties
		 */
		Car maruthiAltok10 = new Car();

		maruthiAltok10.setBrand("Maruthi Alto");
		maruthiAltok10.setModel("k10");
		maruthiAltok10.setColor("Orange");

		displayCarInformation(maruthiAltok10);

		/*
		 * Create swift car object and 
		 * set the properties
		 */
		Car swift = new Car();

		swift.setBrand("Swift");
		swift.setModel("ZDI");
		swift.setColor("Red");
		
		displayCarInformation(swift);

		/*
		 * Create maruthiAlto800 car object and 
		 * set the properties
		 */
		Car maruthiAlto800 = new Car();

		maruthiAlto800.setBrand("Maruthi Alto");
		maruthiAlto800.setModel("800");
		maruthiAlto800.setColor("Blue");
		
		displayCarInformation(maruthiAlto800);

	}

	private static void displayCarInformation(Car car)
	{
		System.out.println("Car Brand : " + car.getBrand());
		System.out.println("Car Model : " + car.getModel());
		System.out.println("Car Color : " + car.getColor());
		System.out.println("--------------------------------");
	}

}
