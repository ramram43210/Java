/*
 * public StringBuffer insert(int offset, String str)
 *
 * Inserts the string into this character sequence.
 *
 * Parameters:
 * ----------
 * offset - the offset.
 * str - a string.
 *
 * Returns:
 * -------
 * a reference to this object.
 */
public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello  World");
		System.out.println(sb);
		String str = "My ";
		sb.insert(6, str);
		System.out.println(sb);

	}
}
