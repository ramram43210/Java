public class TypeCastDemo
{

	public static void main(String[] args)
	{
		double doubleVar = 200000.04;

		/*
		 * Variable of larger capacity is be assigned to another variable of
		 * smaller capacity.
		 */

		int intVar = (int) doubleVar; // explicit type casting required
		byte byteVar = (byte) intVar; // explicit type casting required

		System.out.println("double value " + doubleVar);
		System.out.println("int value " + intVar);
		System.out.println("byte value " + byteVar);

	}
}
