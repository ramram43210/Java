import java.util.regex.Pattern;

/**
 * 
 * \w = Any word character, short for [a-zA-Z_0-9]
 *
 */

public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("metacharacters w");
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
		System.out.println(Pattern.matches("\\w", "a"));//true
		System.out.println(Pattern.matches("\\w", "9"));//true
		System.out.println(Pattern.matches("\\w", "_"));//true
		System.out.println(Pattern.matches("\\w", "a9"));//false
		
		System.out.println("----------------------------------");
		
		System.out.println("metacharacters w with quantifier....");  
		System.out.println(Pattern.matches("\\w*", "peter_99"));//true
		System.out.println(Pattern.matches("\\w*", "peter_99@"));//false
	}

}