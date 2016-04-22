/*
 * public int length()
 * 
 * Parameters: 
 * ----------
 * the length of the sequence of characters currently
 * represented by this object
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		System.out.println("sb = " + sb);
		System.out.println("length = " + sb.length());

		sb.append("Welcome");
		System.out.println("sb = " + sb);
		System.out.println("length = " + sb.length());

	}
}
