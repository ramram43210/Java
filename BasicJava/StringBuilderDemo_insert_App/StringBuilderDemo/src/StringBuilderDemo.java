/*
 * public StringBuilder insert(int offset, String str)
 *
 * Parameters:
 * ----------
 * offset - the offset.
 * 
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
		StringBuilder sb = new StringBuilder("Hello  World");
		System.out.println(sb);
		String str = "My ";
		sb.insert(6, str);
		System.out.println(sb);
	}
}