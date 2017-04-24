public class RepeatingAnnotations
{

	public static void main(String[] args)
	{

		/*
		 * Retrieving Annotations using Reflection API
		 * method
		 */
		Manufacturer[] manufacturerArray = Car.class
				.getAnnotationsByType(Manufacturer.class);

		System.out.println("Number of car manufacturers is "
				+ manufacturerArray.length);

		for (Manufacturer manufacturer : manufacturerArray)
		{
			System.out.println(manufacturer + " , name = "
					+ manufacturer.name());
		}

		System.out.println("\n-------Printing out Car Manufacturers--------");

		/*
		 * Retrieving Annotations using Reflection API
		 * method
		 */
		Cars cars = Car.class.getAnnotation(Cars.class);
		System.out.println(cars);
		manufacturerArray = cars.value();
		for (Manufacturer manufacturer : manufacturerArray)
		{
			System.out.println(manufacturer + " , name = "
					+ manufacturer.name());
		}

	}
}