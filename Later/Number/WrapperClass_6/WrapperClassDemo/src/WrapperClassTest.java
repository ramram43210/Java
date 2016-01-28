public class WrapperClassTest
{

	public static void main(String[] args)
	{

		/*
		 * Decodes a string into an integer. Can accept
		 * string representations of decimal, octal, or
		 * hexadecimal numbers as input.
		 */
		Integer integerObj = Integer.decode("99");
		System.out.println("Integer.decode(\"99\") = " + integerObj);

		/*
		 * Returns an Integer object holding the value of
		 * the specified string representation.
		 */
		integerObj = Integer.valueOf("108");
		System.out
				.println("Integer.valueOf(\"108\") = " + integerObj);

		/*
		 * Returns an Integer object holding the value of
		 * the specified primitive.
		 */
		integerObj = Integer.valueOf(10);
		System.out.println("Integer.valueOf(10) = " + integerObj);

		/*
		 * Returns an Integer object holding the integer
		 * value of the specified string representation,
		 * parsed with the value of radix. For example, if s
		 * = "333" and radix = 8, the method returns the
		 * base-ten integer equivalent of the octal number
		 * 333.
		 */
		integerObj = Integer.valueOf("333", 8);
		System.out.println("Integer.valueOf(\"333\", 8) = "
				+ integerObj);

		/*
		 * Returns a String object representing the value of
		 * this Integer.
		 */
		String strValue = integerObj.toString();
		System.out.println("integerObj.toString() = " + strValue);

		/*
		 * Returns a String object representing the
		 * specified integer.
		 */
		strValue = Integer.toString(876);
		System.out.println("integerObj.toString(876) = " + strValue);
		/*
		 * Returns an integer (decimal only).
		 */
		int intValue = Integer.parseInt("60");
		System.out.println("Integer.parseInt(\"60\") = " + intValue);

		/*
		 * Returns an integer, given a string representation
		 * of decimal, binary, octal, or hexadecimal (radix
		 * equals 10, 2, 8, or 16 respectively) numbers as
		 * input.
		 */
		intValue = Integer.parseInt("24", 8);
		System.out.println("Integer.parseInt(\"24\", 8) = "
				+ intValue);

	}
}
