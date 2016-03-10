/*
 * public int indexOf(int ch)
 *
 * Parameters:
 * ----------
 * ch - a character (Unicode code point).
 *
 * Returns:
 * --------
 * Returns the index within this string of the first
 * occurrence of the specified character. , or -1 if
 * the character does not occur.
 */

public class IndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";
		
		int indexPosition = str.indexOf('e');
		System.out.println("indexOf(\'e\') = " + indexPosition);
		
		indexPosition = str.indexOf(109); //Unicode value of m is 109
		System.out.println("indexOf(\'m\') = " + indexPosition);

		indexPosition = str.indexOf('a');
		System.out.println("indexOf(\'a\') = " + indexPosition);

	}
}
