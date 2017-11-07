import java.util.regex.Pattern;


public class RegexDemo1
{
	public static void main(String[] args)
	{
		/*
		 *  * = Occurs zero or more times, is short for {0,}
		 */
		System.out.println(Pattern.matches("X*", "")); // true
		System.out.println(Pattern.matches("X*", "XXXX")); // true
		System.out.println(Pattern.matches("X*", "aaaa")); // false
		
		System.out.println("-------------------------------");
		
		/*
		 *  + = Occurs one or more times, is short for {1,}
		 */
		System.out.println(Pattern.matches("X+", "")); // false
		System.out.println(Pattern.matches("X+", "X")); // true
		System.out.println(Pattern.matches("X+", "XXXX")); // true
		System.out.println(Pattern.matches("X+", "BBBB")); // false
		
		System.out.println("-------------------------------");
		
		/*
		 *  ? = Occurs no or one times, ? is short for {0,1}.
		 */
		System.out.println(Pattern.matches("X?", "")); // true
		System.out.println(Pattern.matches("X?", "X")); // true
		System.out.println(Pattern.matches("X?", "XXXX")); // false
		System.out.println(Pattern.matches("X?", "BBBB")); // false		
		
	}

}