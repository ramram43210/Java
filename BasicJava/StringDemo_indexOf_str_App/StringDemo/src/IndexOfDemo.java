/*
 * public int indexOf(String str)
 *
 * Parameters:
 * ---------- 
 * str - the substring to search for.
 *
 * Returns:
 * -------
 * the index of the first occurrence of the
 * specified substring, or -1 if there is no such
 * occurrence.
 */

public class IndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome.com";

		int indexPosition = str.indexOf("com");
		System.out.println("indexOf(\"com\") = " + indexPosition);

		indexPosition = str.indexOf("abc");
		System.out.println("indexOf(\"abc\") = " + indexPosition);

	}
}
