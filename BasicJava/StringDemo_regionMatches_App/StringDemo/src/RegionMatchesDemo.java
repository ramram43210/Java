/*
 * public boolean regionMatches(int toffset,
 *		 						String other, 
 *		 						int ooffset, 
 *		 						int len)
 *
 * Parameters:
 * ----------
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
 * exactly matches the specified subregion of the
 * string argument; false otherwise.
 */

public class RegionMatchesDemo
{
	public static void main(String[] args)
	{

		String str1 = new String("Welcome to ramj2ee.com");
		String str2 = new String("ramj2ee");
		String str3 = new String("RAMJ2EE");
		String str4 = new String("hello");

		System.out
				.print("\"Welcome to ramj2ee.com\".regionMatches(11,\"ramj2ee\",0,7) = ");
		System.out.println(str1.regionMatches(11, str2, 0, 7));

		System.out
				.print("\"Welcome to ramj2ee.com\".regionMatches(11,\"RAMJ2EE\",0,7) = ");
		System.out.println(str1.regionMatches(11, str3, 0, 7));

		System.out
				.print("\"Welcome to ramj2ee.com\".regionMatches(11,\"hello\",0,7) = ");
		System.out.println(str1.regionMatches(11, str4, 0, 7));
	}
}