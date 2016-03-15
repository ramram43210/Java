/*
 * public char charAt(int index)
 * 
 * Parameters:
 * ----------  							
 * index - the index of the desired char value.
 * 
 * Returns:
 * -------- 
 * the char value at the specified index.
 * 
 * Throws:
 * ------
 * IndexOutOfBoundsException - if index is negative 
 * or greater than or equal to length(). 
 */

public class CharAtDemo
{

	public static void main(String[] args)
	{

		StringBuffer sb = new StringBuffer("Welcome");

		char ch = sb.charAt(3);
		System.out.println("charAt(3) = " + ch);

		ch = sb.charAt(5);
		System.out.println("charAt(5) = " + ch);
	}
}
