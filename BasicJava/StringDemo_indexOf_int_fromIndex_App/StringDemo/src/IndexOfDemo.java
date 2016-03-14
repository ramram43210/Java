/*
 * public int indexOf(int ch, int fromIndex)
 *
 * Parameters:
 * ---------- 
 * ch - a character (Unicode code point).
 * fromIndex - the index to start the search from.
 *
 * Returns:
 * -------
 * Returns the index within this string of the first
 * occurrence of the specified character, starting
 * the search at the specified index. , or -1 if the
 * character does not occur.
 */

public class IndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welceee";
		int indexPosition = str.indexOf('e', 2);
		System.out.println("indexOf(\'e\',2) = " + indexPosition);

	}
}
