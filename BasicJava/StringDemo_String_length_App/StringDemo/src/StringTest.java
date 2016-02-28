/*
 * public int length()
 *
 * Returns the length of this string. The length is
 * equal to the number of Unicode code units in the
 * string.
 *
 * Returns: 
 * -------
 * 
 * the length of the sequence of characters
 * represented by this object.
 */

public class StringTest
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		int length = str.length();
		System.out.println("length = " + length);
	}

}
