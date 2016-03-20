/*
 * public int compareToIgnoreCase(String str)
 * 
 * Parameters: 
 * ---------- 
 * str - the String to be compared.
 * 
 * Returns: 
 * ------- 
 * Returns an integer indicating whether this string
 * is greater than (result is > 0), equal to (result
 * is = 0), or less than (result is < 0) the
 * argument.
 */

public class CompareToIgnoreCaseDemo
{
	public static void main(String[] args)
	{

		int result = "welcome".compareTo("WELCOME");
		System.out.println("\"welcome\".compareTo(\"WELCOME\") = "
				+ result);

		result = "welcome".compareToIgnoreCase("WELCOME");
		System.out
				.println("\"welcome\".compareToIgnoreCase(\"WELCOME\") = "
						+ result);
	}
}