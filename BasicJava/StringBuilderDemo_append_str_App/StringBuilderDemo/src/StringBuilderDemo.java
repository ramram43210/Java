/*
 * public StringBuilder append(String str)
 *
 * Parameters:
 * ----------
 * str - a string.
 *
 * Returns:
 * -------
 * a reference to this object.
 */

public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println(sb);
		sb.append("Java");
		System.out.println(sb);
	}
}
