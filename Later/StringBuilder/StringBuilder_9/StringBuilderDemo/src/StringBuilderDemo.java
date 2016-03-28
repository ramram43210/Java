/*
 * public StringBuilder delete(int start, int end)
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
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Welcome");
		System.out.println(sb);
		sb = sb.delete(3, 6);
		System.out.println(sb);
	}
}