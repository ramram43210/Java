import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 *  It would return true if string matches exactly "Tom"
		 */
		System.out.println(Pattern.matches("Tom", "Tom")); // true
		System.out.println(Pattern.matches("Tom", "tom")); // false
		
		System.out.println("-----------------------------");

		/*
		 * returns true if the string matches exactly "tom" or "Tom"
		 */
		System.out.println(Pattern.matches("[Tt]om", "Tom")); // true
		System.out.println(Pattern.matches("[Tt]om", "tom")); // true
		System.out.println(Pattern.matches("[Tt]om", "Tome")); // false

		System.out.println("-----------------------------");
		
		/*
		 * Returns true if the string matches exactly "tim" or "Tim" or "jin" or
		 * "Jin"
		 */
		System.out.println(Pattern.matches("[tT]im|[jJ]in", "Tim"));// true
		System.out.println(Pattern.matches("[tT]im|[jJ]in", "jin"));// true
		System.out.println(Pattern.matches("[tT]im|[jJ]in", "john"));// false

	}

}