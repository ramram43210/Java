public class EndsWithDemo
{
	public static void main(String[] args)
	{
		String str = "Welcome Peter";

		/*
		 * public boolean endsWith(String suffix)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * prefix - the prefix.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * true if the character sequence represented by the
		 * argument is a prefix of the character sequence
		 * represented by this string; false otherwise.
		 */

		boolean result = str.startsWith("Wel");
		System.out.println("result = " + result);

	}
}