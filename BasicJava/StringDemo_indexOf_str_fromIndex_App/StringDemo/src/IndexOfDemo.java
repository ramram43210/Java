/*
 * public int indexOf(String str, int fromIndex)
 * 
 * Parameters: 
 * ----------  
 * str - the substring to search for. 
 * fromIndex - the index from which to start the 
 * search.
 * 
 * Returns: 
 * ------- 
 * the index of the first occurrence of the
 * specified substring, starting at the specified
 * index, or -1 if there is no such occurrence.
 */

public class IndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "com.com.com";
		int indexPosition = str.indexOf("com", 2);
		System.out.println("indexOf(\"com\",2) = " + indexPosition);
	}
}
