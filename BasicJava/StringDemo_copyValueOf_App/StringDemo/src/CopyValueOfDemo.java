/*
 * public static String copyValueOf(char[] data)
 * 
 * Equivalent to valueOf(char[]).
 * 
 * Parameters: 
 * ---------- 
 * data - the character array.
 * 
 * Returns: 
 * -------  
 * a String that contains the
 * characters of the character array.
 */
public class CopyValueOfDemo
{

	public static void main(String[] args)
	{
		char[] charArray =
		{ 'H', 'i' };

		String str = String.copyValueOf(charArray);
		System.out.println(str);

	}

}