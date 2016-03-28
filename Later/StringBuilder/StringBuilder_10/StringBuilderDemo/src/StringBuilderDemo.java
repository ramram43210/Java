/*
 * public StringBuilder deleteCharAt(int index)
 * 
 * Parameters: 
 * -----------
 * index - Index of char to remove
 * 
 * Returns:
 * --------
 * This object.
 * 
 * Throws:
 * -------
 * StringIndexOutOfBoundsException - if the index is negative 
 * or greater than or equal to length().
 * 
 */

public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Welcome");
		System.out.println(sb);
		sb = sb.deleteCharAt(2);
		System.out.println(sb);
	}
}
