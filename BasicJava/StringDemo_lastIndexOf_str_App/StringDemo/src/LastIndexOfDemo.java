/*
 * public int lastIndexOf(String str)
 * 
 * Parameters: 
 * ----------  
 * str - the substring to search for.
 * 
 * Returns: 
 * -------  
 * the index of the last occurrence of the specified
 * substring, or -1 if there is no such occurrence.
 */

public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome.com";

		int indexPosition = str.lastIndexOf("com");
		System.out.println("lastIndexOf(\"com\") = " + indexPosition);

		indexPosition = str.lastIndexOf("abc");
		System.out.println("lastIndexOf(\"abc\") = " + indexPosition);

	}
}
