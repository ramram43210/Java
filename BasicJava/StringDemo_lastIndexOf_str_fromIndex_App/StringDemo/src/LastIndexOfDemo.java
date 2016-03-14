/*
 * public int lastIndexOf(String str, int fromIndex)
 * 
 * Parameters: 
 * ----------  
 * str - the substring to search for. 
 * fromIndex - the index to start the search from.
 * 
 * Returns: 
 * ------- 
 * the index of the last occurrence of the specified
 * substring, searching backward from the specified
 * index, or -1 if there is no such occurrence.
 */

public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "com.com.com";

		int indexPosition = str.lastIndexOf("com", 7);
		System.out.println("lastIndexOf(\"com\",7) = "
				+ indexPosition);

	}
}
