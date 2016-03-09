/*
 * public StringBuffer reverse()
 *  
 * Returns: 
 * -------- 
 * a reference to this object.
 */

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb = sb.reverse();
		System.out.println(sb);
	}
}
