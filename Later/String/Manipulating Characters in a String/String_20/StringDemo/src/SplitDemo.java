public class SplitDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		/*
		 * public int indexOf(int ch)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * ch - a character (Unicode code point).
		 * 
		 * 
		 * Returns: 
		 * -------
		 * 
		 * Returns the index within this string of the first
		 * occurrence of the specified character. , or -1 if
		 * the character does not occur.
		 */

		int indexPosition = str.indexOf("e");
		System.out.println("indexPosition = " + indexPosition);

	}
}
