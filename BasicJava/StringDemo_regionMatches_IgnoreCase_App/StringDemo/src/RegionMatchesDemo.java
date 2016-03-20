/*
 * public boolean regionMatches(boolean ignoreCase,
 *                                     int toffset, 
 *                                     String other, 
 *                                     int ooffset, 
 *                                     int len)
 *
 * Parameters:
 * ----------
 * ignoreCase - if true, ignore case when comparing
 * characters.
 *
 * toffset - the starting offset of the subregion in
 * this string.
 *
 * other - the string argument.
 *
 * ooffset - the starting offset of the subregion in
 * the string argument.
 *
 * len - the number of characters to compare.
 *
 * Returns:
 * -------
 * true if the specified subregion of this string
 * matches the specified subregion of the string
 * argument; false otherwise. Whether the matching
 * is exact or case insensitive depends on the
 * ignoreCase argument.
 */

public class RegionMatchesDemo
{
	public static void main(String[] args)
	{

		String str1 = new String("Welcome to ramj2ee.com");
		String str2 = new String("RAMJ2EE");

		System.out
				.print("\"Welcome to ramj2ee.com\".regionMatches(false,11,\"RAMJ2EE\",0,7) = ");
		System.out.println(str1.regionMatches(false, 11, str2, 0, 7));

		System.out
				.print("\"Welcome to ramj2ee.com\".regionMatches(true,11,\"RAMJ2EE\",0,7)  = ");
		System.out.println(str1.regionMatches(true, 11, str2, 0, 7));

	}
}