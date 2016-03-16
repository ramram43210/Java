/*
 * public boolean endsWith(String suffix)
 * 
 * Parameters: 
 * ---------- 
 * suffix - the suffix.
 * 
 * Returns: 
 * ------- 
 * true if the character sequence represented by the
 * argument is a suffix of the character sequence
 * represented by this object; false otherwise.
 */

public class EndsWithDemo
{
	public static void main(String[] args)
	{
		String str = "Welcome Peter";
		boolean result = str.endsWith("Peter");
		System.out.println("result = " + result);
	}
}