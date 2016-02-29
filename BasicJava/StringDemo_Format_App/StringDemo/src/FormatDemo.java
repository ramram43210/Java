/*
 * public static String format(String format,
 *                                 Object... args)
 * 
 * Returns a formatted string using the specified
 * format string and arguments.
 * 
 * Parameters: 
 * ----------
 * 
 * format - A format string
 * 
 * args - Arguments referenced by the format
 * specifiers in the format string
 */

public class FormatDemo
{

	public static void main(String[] args)
	{
		float floatVar = 12.3f;
		int intVar = 100;
		String stringVar = "Hello,";

		String fs = String.format("The value of the float "
				+ "variable is %f, while " + "the value of the "
				+ "integer variable is %d, "
				+ " and the string is %s", floatVar, intVar,
				stringVar);
		System.out.println(fs);
	}
}
