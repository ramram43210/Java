/*
 * public void setCharAt(int index, char ch)
 * 
 * Parameters: 
 * ---------- 
 * index - the index of the character to modify. 
 * ch - the new character.
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if index is negative or
 * greater than or equal to length().
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		String str = "Dig";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Before setCharAt, sb = " + sb);
		
		sb.setCharAt(1, 'o');

		System.out.println("After setCharAt, sb  = " + sb);

	}
}
