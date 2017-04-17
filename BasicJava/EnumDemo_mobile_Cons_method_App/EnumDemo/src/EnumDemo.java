public class EnumDemo
{
	public static void main(String args[])
	{
		System.out.println("Mobile Phone List:");
		System.out.println("-------------------");
		
		Mobile[] mobileArray = Mobile.values();
		
		for (Mobile mobile : mobileArray)
		{
			System.out.println(mobile + " costs " + mobile.getPrice()
					+ " dollars");
		}
		System.out.println("-------------------");
		
		Mobile mobile = Mobile.Motorola;
		/*
		 * Returns the name of this enum constant, exactly
		 * as declared in its enum declaration.
		 */
		
		String mobileName = mobile.name();		
		System.out.println("\nMobileName = " + mobileName);

	}
}