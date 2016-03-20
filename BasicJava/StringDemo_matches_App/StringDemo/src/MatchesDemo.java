/*
 * public boolean matches(String regex)
 * 
 * Parameters: 
 * ---------- 
 * regex - the regular expression to which this
 * string is to be matched
 * 
 * Returns: 
 * ------- 
 * true if, and only if, this string matches the
 * given regular expression
 * 
 * Throws:
 * ------ 
 * PatternSyntaxException - if the regular
 * expression's syntax is invalid
 */

public class MatchesDemo
{
	public static void main(String[] args)
	{

		String str = new String("Welcome to ramj2ee.com");

		System.out
				.print("\"Welcome to ramj2ee.com\".matches(\"Welcome(.*)\") = ");
		System.out.println(str.matches("Welcome(.*)"));

		System.out
				.print("\"Welcome to ramj2ee.com\".matches(\"(.*)ramj2ee(.*)\") = ");
		System.out.println(str.matches("(.*)ramj2ee(.*)"));

	}
}