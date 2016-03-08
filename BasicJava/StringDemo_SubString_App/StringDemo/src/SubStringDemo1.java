/*
 * public String substring(int beginIndex, int
 *                                        endIndex)
 *
 * Parameters:
 * ---------- 
 * beginIndex - the beginning index, inclusive.
 * endIndex - the ending index, exclusive.
 *
 * Returns:
 * -------
 * Returns a string that is a substring of this
 * string. The substring begins at the specified
 * beginIndex and extends to the character at index
 * endIndex - 1. Thus the length of the substring is
 * endIndex-beginIndex.
 */

public class SubStringDemo1
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		String subString = str.substring(3, 6);
		System.out.println("subString = " + subString);
	}
}
