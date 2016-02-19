public class CompareToIgnoreCaseDemo
{
	public static void main(String[] args)
	{

		/*
		 * public int compareToIgnoreCase(String str)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * str - the String to be compared.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * Returns an integer indicating whether this string
		 * is greater than (result is > 0), equal to (result
		 * is = 0), or less than (result is < 0) the
		 * argument.
		 */

		int result = "Welcome".compareToIgnoreCase("WELCOME");
		System.out
				.println("\"Welcome\".compareToIgnoreCase(\"Welcome\") = "
						+ result);

		result = "Hello".compareToIgnoreCase("WELCOME");
		System.out
				.println("\"Hello\".compareToIgnoreCase(\"Welcome\") = "
						+ result);

		result = "compareToIgnoreCase".compareToIgnoreCase("Apple");
		System.out
				.println("\"Welcome\".compareToIgnoreCase(\"Apple\") = "
						+ result);

	}
}