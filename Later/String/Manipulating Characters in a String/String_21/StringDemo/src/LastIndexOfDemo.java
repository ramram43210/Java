public class LastIndexDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		/*
		 * public int lastIndexOf(int ch)
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
		 * Returns the index within this string of the last 
		 * occurrence of the specified character. , or -1 if
		 * the character does not occur.
		 */

		int indexPosition = str.lastIndexOf("e");
		System.out.println("lastIndexOf(\"e\") = " + indexPosition);
		
		indexPosition = str.lastIndexOf("a");
		System.out.println("lastIndexOf(\"a\") = " + indexPosition);

	}
}
