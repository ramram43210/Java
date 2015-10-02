public class TypeConversionDemo
{

	public static void main(String[] args)
	{
		double doubleVariable;
		long longVariable;
		int intVariable = 10;

		/*
		 * Variable of smaller capacity is be assigned to another variable of
		 * bigger capacity.
		 */
		longVariable = intVariable;
		doubleVariable = intVariable;

		System.out.println("longVariable : " + longVariable);
		System.out.println("doubleVariable : " + doubleVariable);

	}

}
