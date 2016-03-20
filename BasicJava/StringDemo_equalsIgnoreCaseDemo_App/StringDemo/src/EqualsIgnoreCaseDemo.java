/*
 * public boolean equalsIgnoreCase(String
 *                             anotherString)
 * 
 * Parameters: 
 * ---------- 
 * anotherString - The String to compare this String
 * against.
 * 
 * Returns: 
 * ------- 
 * true if the argument is not null and it
 * represents an equivalent String ignoring case;
 * false otherwise.
 */

public class EqualsIgnoreCaseDemo
{
	public static void main(String[] args)
	{

		boolean result = "welcome".equalsIgnoreCase("WELCOME");
		System.out
				.println("\"welcome\".equalsIgnoreCase(\"WELCOME\") = "
						+ result);

	}
}