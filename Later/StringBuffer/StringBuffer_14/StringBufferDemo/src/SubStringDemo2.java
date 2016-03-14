/*
 * public String substring(int start)
 * 
 * Parameters: 
 * ----------
 * start - The beginning index, inclusive.
 * 
 * Returns: 
 * -------
 * The new string.
 * 
 * Throws:
 * ------
 * StringIndexOutOfBoundsException - if start is less 
 * than zero, or greater than the length of this object.
 */

public class SubStringDemo2
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Welcome");
		String subString = sb.substring(3);
		System.out.println("subString = " + subString);

	}
}
