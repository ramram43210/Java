/*
 * Converting Strings to primitive Numbers.
 */
public class ParseXXXDemo
{

	public static void main(String[] args)
	{
		/*
		 * Each of the Number subclasses that wrap primitive
		 * numeric types also provides a parseXXXX() method
		 * (for example, parseFloat()) that can be used to
		 * convert strings to primitive numbers. Since a
		 * primitive type is returned instead of an object,
		 * the parseFloat() method is more direct than the
		 * valueOf() method.
		 */
		int intVar = Integer.parseInt("100");
		System.out.println("intVar    = " + intVar);

		double doubleVar = Double.parseDouble("20.289");
		System.out.println("doubleVar = " + doubleVar);
	}
}
