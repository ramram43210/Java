enum Mobile
{
	Samsung, Nokia, Motorola;
}

public class EnumDemo
{
	public static void main(String args[])
	{
		Mobile mobile = Mobile.Nokia;

		/*
		 * Returns the ordinal of this enumeration constant
		 * (its position in its enum declaration, where the
		 * initial constant is assigned an ordinal of zero).
		 */

		int ordinal = mobile.ordinal();
		System.out.println("The ordinal is = " + ordinal);

	}
}