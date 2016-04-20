/*
 * public StringBuilder replace(int start, int end,
 *                                         String str)
 * 		  
 * Parameters: 
 * -----------	 
 * start - The beginning index, inclusive.
 * 
 * end - The ending index, exclusive.
 * 
 * str - String that will replace previous contents.
 * 
 * Returns: 
 * -------- 
 * This object.
 * 
 * Throws:
 * -------
 * StringIndexOutOfBoundsException - if start is negative, 
 * greater than length(), or greater than end. 
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello Dave Welcome");
		System.out.println(sb);
		sb = sb.replace(6, 10, "Peter");
		System.out.println(sb);
	}
}