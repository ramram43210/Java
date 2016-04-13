/*
 * public void setCharAt(int index, char ch)
 * 
 * Parameters: 
 * ---------- 
 * index - the index of the character to modify.
 *  
 * ch - the new character.
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if index is negative or
 * greater than or equal to length().
 */
public class StringBufferDemo
{

	public static void main(String[] args)
	{
		String str = "Dig";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Before setCharAt, sb = " + sb);

		sb.setCharAt(1, 'o');

		System.out.println("After setCharAt, sb  = " + sb);

	}
}
