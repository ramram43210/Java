/*
 * public int capacity()
 *  
 * Returns: 
 * -------- 
 * the current capacity
 */

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		// default 16
		System.out.println(sb.capacity());
		sb.append("Hello");
		// now 16
		System.out.println(sb.capacity());
		sb.append("Hello peter welcome to India");

		// now (16*2)+2=34 i.e (oldcapacity*2)+2
		System.out.println(sb.capacity());
	}
}
