public class RegionMatchesDemo
{
	public static void main(String[] args)
	{

		String Str1 = new String("Welcome to ramj2ee.com");
		String Str2 = new String("ramj2ee");
		String Str3 = new String("RAMJ2EE");
		String Str4 = new String("hello");

		/*
		 * public boolean regionMatches(int toffset,
		 						String
		 * other, int ooffset, int len)
		 *
		 * Parameters:
		 * ----------
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
		 *
		 * true if the specified subregion of this string
		 * exactly matches the specified subregion of the
		 * string argument; false otherwise.
		 */


				System.out
						.print("\"Welcome to ramj2ee.com\".regionMatches(11,\"ramj2ee\",0,7) = ");
				System.out.println(Str1.regionMatches(11, Str2, 0, 7));

				System.out
						.print("\"Welcome to ramj2ee.com\".regionMatches(11,\"RAMJ2EE\",0,7) = ");
				System.out.println(Str1.regionMatches(11, Str3, 0, 7));

				System.out
						.print("\"Welcome to ramj2ee.com\".regionMatches(11,\"hello\",0,7) = ");
		System.out.println(Str1.regionMatches(11, Str4, 0, 7));
	}
}