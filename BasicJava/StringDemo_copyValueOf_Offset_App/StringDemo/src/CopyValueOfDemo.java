/*
 * public static String copyValueOf(char[] data, 
 *                           int offset, int count) 
 * 
 * Equivalent to valueOf(char[], int, int).
 * 
 * Parameters: 
 * ---------- 
 * data - the character array. 
 * 
 * offset - initial offset of the subarray. 
 * 
 * count - length of the subarray.
 * 
 * Returns: 
 * ------- 
 * a String that contains the characters of the
 * specified subarray of the character array.
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if offset is negative, or
 * count is negative, or offset+count is larger than
 * data.length.
 */

public class CopyValueOfDemo
{

	public static void main(String[] args)
	{
		char[] charArray =
		{ 'H', 'i', ' ', 'W', 'e', 'l', 'c', 'o', 'm', 'e' };

		String str = String.copyValueOf(charArray, 6, 3);
		System.out.println(str);

	}

}