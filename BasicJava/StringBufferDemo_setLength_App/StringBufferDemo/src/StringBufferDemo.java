/*
 * public void setLength(int newLength)
 * 
 * Parameters: 
 * ---------- 
 * newLength - the new length
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if the newLength 
 * argument is negative.
 */
public class StringBufferDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Before setLength, sb = " + sb);
		System.out.println("Before setLength, sb = " + sb.length());

		sb.setLength(3);
		
		System.out.println("After setLength, sb = " + sb);
		System.out.println("After setLength, sb = " + sb.length());

	}
}
