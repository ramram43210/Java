/*
 * public StringBuffer deleteCharAt(int index)
 * 
 * Parameters: 
 * -----------
 * index - Index of char to remove
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
		sb = sb.deleteCharAt(2);
		System.out.println(sb);
	}
}
