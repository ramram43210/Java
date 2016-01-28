public class PrimitiveToWrapperExample
{

	public static void main(String[] args)
	{

		/*
		 * Primitive to Wrapper Example.
		 * 
		 * Converting int into Integer
		 */

		int intValue = 300;
		Integer integerObj1 = Integer.valueOf(intValue);

		System.out.println("integerObj1 = " + integerObj1);

		/*
		 * Autoboxing, now compiler will write
		 * Integer.valueOf(a) internally
		 */

		Integer integerObj2 = intValue;
		System.out.println("integerObj2 = " + integerObj2);

	}
}
