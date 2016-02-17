public class WrapperClassTest
{

	public static void main(String[] args)
	{
		Integer integerObj1 = new Integer(100);
		Integer integerObj2 = new Integer(10);

		/*
		 * public boolean equals(Object obj)
		 * 
		 * Parameters: 
		 * -----------
		 * 
		 * obj - the object to compare with.
		 * 
		 * Returns: 
		 * --------
		 * 
		 * Determines whether this number object is equal to
		 * the argument. The methods return true if the
		 * argument is not null and is an object of the same
		 * type and with the same numeric value.
		 */
		boolean result = integerObj1.equals(integerObj2);
		System.out.println("result = " + result);

	}
}
