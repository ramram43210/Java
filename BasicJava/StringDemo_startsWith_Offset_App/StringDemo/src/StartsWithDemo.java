/*
 * public boolean startsWith(String prefix, int
 *                                          offset)
 * 
 * Parameters: 
 * ---------- 
 * prefix - the prefix.  
 * offset - where to begin looking in this string.
 * 
 * Returns: 
 * ------- 
 * true if the character sequence represented by the
 * argument is a prefix of the substring of this
 * object starting at index offset; false
 * otherwise.
 */

public class StartsWithDemo
{
	public static void main(String[] args)
	{
		String str = "Welcome Peter";

		boolean result = str.startsWith("come", 3);
		System.out.println("startsWith(\"come\", 3) = " + result);

		result = str.startsWith("come", 0);
		System.out.println("startsWith(\"come\", 0) = " + result);

	}
}