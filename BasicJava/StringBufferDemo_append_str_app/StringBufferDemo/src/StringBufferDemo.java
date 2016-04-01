/*
 * public StringBuffer append(String str)
 *
 * Appends the specified string to this character sequence.
 *
 * Parameters:
 * -----------
 * str - a string.
 *
 * Returns:
 * --------
 * a reference to this object.
 */

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb);
	}
}
