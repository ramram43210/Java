public class IndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome.com";

		/*
		 * public int indexOf(String str, int fromIndex)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * str - the substring to search for. 
		 * fromIndex - the index from which to start the 
		 * search.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * the index of the first occurrence of the
		 * specified substring, starting at the specified
		 * index, or -1 if there is no such occurrence.
		 */

		int indexPosition = str.indexOf("com", 4);
		System.out.println("indexOf(\"com\",4) = " + indexPosition);

		indexPosition = str.indexOf("abc",4);
		System.out.println("indexOf(\"abc\",4) = " + indexPosition);

	}
}
