import java.util.regex.Pattern;

/**
 * 
 * \W = Any non-word character, short for [^\w]
 *
 */

public class RegexDemo2
{
	public static void main(String[] args)
	{
		System.out.println("metacharacters W");
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
		System.out.println(Pattern.matches("\\W", "@"));//true
		System.out.println(Pattern.matches("\\W", "a"));//false
		System.out.println(Pattern.matches("\\W", "9"));//false
		System.out.println(Pattern.matches("\\W", "@@"));//false
		
		System.out.println("----------------------------------");
		
		System.out.println("metacharacters W with quantifier....");  
		System.out.println(Pattern.matches("\\W*", "@@"));//true
		System.out.println(Pattern.matches("\\W*", "@@peter"));//false
	}

}