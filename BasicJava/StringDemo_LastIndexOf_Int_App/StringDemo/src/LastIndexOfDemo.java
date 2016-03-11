/*
 * public int lastIndexOf(int ch)
 * 
 * Parameters: 
 * ----------  
 * ch - a character (Unicode code point).
 *  
 * Returns: 
 * ------- 
 * Returns the index within this string of the last 
 * occurrence of the specified character. , or -1 if
 * the character does not occur.
 */

public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		int indexPosition = str.lastIndexOf('e');
		System.out.println("lastIndexOf(\'e\') = " + indexPosition);

		// Unicode value of m is 109.
		indexPosition = str.lastIndexOf(109);
		System.out.println("lastIndexOf(\'m\') = " + indexPosition);

		indexPosition = str.lastIndexOf('a');
		System.out.println("lastIndexOf(\'a\') = " + indexPosition);

	}
}
