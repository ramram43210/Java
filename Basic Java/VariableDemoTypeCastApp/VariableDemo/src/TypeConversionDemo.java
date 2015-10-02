public class TypeConversionDemo
{

	public static void main(String[] args)
	{

		int intVar = 200;
		/*
		 * Variable of smaller capacity is be assigned to another variable of
		 * bigger capacity.
		 */

		long longVar = intVar; // no explicit type casting required
		float floatVar = longVar; // no explicit type casting required

		System.out.println("Int value : " + intVar);
		System.out.println("Long value : " + longVar);
		System.out.println("Float value : " + floatVar);

	}

}
