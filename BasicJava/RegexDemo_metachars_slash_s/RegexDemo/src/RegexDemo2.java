import java.util.regex.Pattern;

/**
 * 
 * \S = Any non-whitespace character Should come only one time, short for [^\s]
 *
 */

public class RegexDemo2
{
	public static void main(String[] args)
	{
		System.out.println("metacharacters S");
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
		System.out.println(Pattern.matches("\\S", "a"));//true 
		System.out.println(Pattern.matches("\\S", "ab"));//false 
		System.out.println(Pattern.matches("\\S", " "));//false 
		System.out.println(Pattern.matches("\\S", "\t"));//false
		System.out.println(Pattern.matches("\\S", "\n"));//false 
		System.out.println(Pattern.matches("\\S", "\f"));//false 
	
		
		System.out.println("----------------------------------");
		
		System.out.println("metacharacters S with quantifier....");  
		System.out.println(Pattern.matches("\\S*", "peter"));//true
	}

}