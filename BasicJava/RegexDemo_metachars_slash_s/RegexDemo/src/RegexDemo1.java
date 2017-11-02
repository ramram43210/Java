import java.util.regex.Pattern;

/**
 * 
 * \s = Any whitespace character should come only one time, short for [\t\n\x0B\f\r]
 *
 */

public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("metacharacters s");
		/*
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 
		 * input - The character sequence to be matched
		 * 
		 * Returns:
		 * 
		 * whether or not the regular expression matches on the input
		 * 
		 */
		System.out.println(Pattern.matches("\\s", " "));//true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "\t"));//true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "\n"));//true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "\f"));//true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "     "));//false [Only one whitespace can come, but more whitespaces]
		System.out.println(Pattern.matches("\\s", "\t\t"));//false [Only one whitespace can come, but more whitespaces]
		System.out.println(Pattern.matches("\\s", "ab"));//false [not a whitespace]
		
		System.out.println("----------------------------------");
		
		System.out.println("metacharacters s with quantifier....");  
		System.out.println(Pattern.matches("\\s*", "       "));//true [more than one whitespace can come]
		System.out.println(Pattern.matches("\\s*", "\r\r"));//true [more than one whitespace can come]
	}

}