/*
 * public String substring(int beginIndex)
 * 
 * Parameters: 
 * ----------
 * beginIndex - the beginning index,inclusive.
 * 
 * Returns: 
 * -------
 * Returns a string that is a substring of this
 * string. The substring begins with the character
 * at the specified index and extends to the end of
 * this string.
 */

public class SubStringDemo2
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		String subString = str.substring(3);
		System.out.println("subString = " + subString);

	}
}
