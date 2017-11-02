import java.util.regex.Pattern;

/**
 *
 * Create a regular expression that accepts alpha numeric characters only. Its
 * length must be 4 characters long only.
 *
 */

public class RegexDemo
{
	public static void main(String[] args)
	{
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
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Juli"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Ju22"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Peter"));//false (more than 4 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "J$22"));//false ($ is not matched)
	}

}