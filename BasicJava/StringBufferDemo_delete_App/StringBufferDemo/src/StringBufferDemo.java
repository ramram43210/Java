/*
 * public StringBuffer delete(int start, int end)
 * 
 * Parameters: 
 * -----------
 * start - The beginning index, inclusive.
 *  
 * end - The ending index, exclusive.
 * 
 * Returns:
 * --------
 * This object.
 */

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb);
		sb = sb.delete(3, 6);
		System.out.println(sb);
	}
}
