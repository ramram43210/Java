/*
 * public char charAt(int index)
 * 
 * Parameters:
 * ----------  							
 * index - the index of the char value.
 * 
 * Returns:
 * -------- 
 * The char value at the specified index of
 * this string. The first char value is at index 0.
 */

public class CharAtDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		char ch = str.charAt(3);
		System.out.println("charAt(3) = " + ch);

		ch = str.charAt(5);
		System.out.println("charAt(5) = " + ch);
	}
}
