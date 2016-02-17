public class WrapperClassTest
{

	public static void main(String[] args)
	{
		Integer integerObj1 = new Integer(10);
		Integer integerObj2 = new Integer(10);

		/*
		 * public int compareTo(Integer anotherInteger)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * anotherInteger - the Integer to be compared.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * the value 0 if this Integer is equal to the
		 * argument Integer; a value less than 0 if this
		 * Integer is numerically less than the argument
		 * Integer; and a value greater than 0 if this
		 * Integer is numerically greater than the argument
		 * Integer (signed comparison).
		 */
		int result = integerObj1.compareTo(integerObj2);
		System.out.println("result = " + result);

		if (result == 0)
		{
			System.out.println(integerObj1 + " is equal to "
					+ integerObj2);
		}
		else if (result == -1)
		{
			System.out.println(integerObj1 + " is less than "
					+ integerObj2);
		}

		else if (result == 1)
		{
			System.out.println(integerObj1 + " is greater than "
					+ integerObj2);
		}

	}
}
