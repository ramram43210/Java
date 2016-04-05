/*
 * public int length()
 * 
 * Parameters: 
 * ----------
 * the length of the sequence of characters currently
 * represented by this object
 */
public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("length = " + sb.length());

		sb.append(40);
		System.out.println("length = " + sb.length());

	}
}
