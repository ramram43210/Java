/*
 * public int lastIndexOf(int ch, int fromIndex)
 * 
 * Parameters: 
 * ---------- * 
 * ch - a character (Unicode code point).
 * fromIndex - the index to start the search from.
 * 
 * Returns: 
 * ------- 
 * Returns the index within this string of the last 
 * occurrence of the specified character, starting
 * the search at the specified index. , or -1 if the
 * character does not occur.
 */

public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcece";
		int indexPosition = str.lastIndexOf('e',5);
		System.out.println("lastIndexOf(\'e\',5) = " + indexPosition);

	}
}
