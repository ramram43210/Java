/*
 * public static String join(CharSequence delimiter,
 *                              CharSequence... elements)
 * 
 * Parameters: 
 * ----------- 
 * delimiter - the delimiter that separates each element
 * 
 * elements - the elements to join together.
 * 
 * Returns: 
 * -------- 
 * a new String that is composed of the elements
 * separated by the delimiter.
 * 
 * Throws: 
 * ------- 
 * NullPointerException - If delimiter or elements is
 * null
 */

public class JoinDemo
{
	public static void main(String[] args)
	{
		String str1 = "welcome";
		String str2 = "to";
		String str3 = "India";

		String joinString = String.join("_", str1, str2, str3);
		System.out.println("JoinString = " + joinString);

	}

}