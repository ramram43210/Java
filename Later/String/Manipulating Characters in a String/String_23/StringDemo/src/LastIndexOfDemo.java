public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		/*
		 * public int lastIndexOf(int ch, int fromIndex)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * ch - a character (Unicode code point).
		 * fromIndex - the index to start the search from.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * Returns the index within this string of the last 
		 * occurrence of the specified character, starting
		 * the search at the specified index. , or -1 if the
		 * character does not occur.
		 */

		int indexPosition = str.lastIndexOf("e", 4);
		System.out.println("lastIndexOf(\"e\",4) = " + indexPosition);

	}
}
