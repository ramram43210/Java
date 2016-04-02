/*
 * public StringBuffer replace(int start, int end,
 *                                     String str)
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
 */

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello Dave Welcome");
		System.out.println(sb);
		sb = sb.replace(6, 10, "Peter");
		System.out.println(sb);
	}
}
