/*
 * public boolean startsWith(String prefix)
 * 
 * Parameters: 
 * ---------- 
 * prefix - the prefix.
 * 
 * Returns: 
 * ------- 
 * true if the character sequence represented 
 * by the argument is a prefix of the
 * character sequence represented by this string; false
 * otherwise.
 */
public class StartsWithDemo
{
	public static void main(String[] args)
	{
		String str = "Hi Peter";
		boolean result = str.startsWith("Hi");
		System.out.println("result = " + result);
	}
}