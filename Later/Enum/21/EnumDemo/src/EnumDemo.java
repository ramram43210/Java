enum Mobile
{
	Samsung(500), Nokia(300), Motorola(400);

	int price;

	Mobile(int p)
	{
		price = p;
	}

	int showPrice()
	{
		return price;
	}
}

public class EnumDemo
{
	public static void main(String args[])
	{
		System.out.println("Mobile Phone List:");
		System.out.println("-------------------");
		for (Mobile mobile : Mobile.values())
		{
			System.out.println(mobile + " costs " + mobile.showPrice()
					+ " dollars");
		}

		Mobile mobile = Mobile.Motorola;
		/*
		 * Returns the name of this enum constant, exactly
		 * as declared in its enum declaration.
		 */
		
		String mobileName = mobile.name();		
		System.out.println("\nMobileName = " + mobileName);

	}
}