public class CharAtDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";
		
		/*
		 * public String substring(int beginIndex, int
		 * endIndex)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * beginIndex - the beginning index, inclusive.
		 * endIndex - the ending index, exclusive.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * Returns a string that is a substring of this
		 * string. The substring begins at the specified
		 * beginIndex and extends to the character at index
		 * endIndex - 1. Thus the length of the substring is
		 * endIndex-beginIndex.
		 */

		String subString1 = str.substring(3, 6);
		System.out.println("subString1 = " + subString1);

		/*
		 * public String substring(int beginIndex)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * beginIndex - the beginning index,inclusive.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * Returns a string that is a substring of this
		 * string. The substring begins with the character
		 * at the specified index and extends to the end of
		 * this string.
		 */

		String subString2 = str.substring(3);
		System.out.println("subString2 = " + subString2);

	}
}
