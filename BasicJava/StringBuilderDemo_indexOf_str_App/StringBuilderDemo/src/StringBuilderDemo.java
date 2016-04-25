/*
 * public int indexOf(String str)
 * 
 * Parameters: 
 * ----------
 * str - any string.
 * 
 * Returns: 
 * ------- 
 * if the string argument occurs as a
 * substring within this object, then the index of the
 * first character of the first such substring is
 * returned; if it does not occur as a substring, -1 is
 * returned.
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{

		String str = "Welcome.com";
		StringBuilder sb = new StringBuilder(str);

		int indexPosition = sb.indexOf("com"); // returns 3
		System.out.println("indexOf(\"com\") = " + indexPosition);

		indexPosition = sb.indexOf("abc");// returns -1
		System.out.println("indexOf(\"abc\") = " + indexPosition);

	}
}
