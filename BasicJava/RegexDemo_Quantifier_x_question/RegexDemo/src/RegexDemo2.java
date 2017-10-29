import java.util.regex.Pattern;

public class RegexDemo2
{
	public static void main(String[] args)
	{
		System.out.println("+ quantifier = occurs once or more times");  
		
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
		System.out.println(Pattern.matches("[ab]+", "a"));//true (a or b once or more times)  
		System.out.println(Pattern.matches("[ab]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[ab]+", "aabb"));//true (a and b comes more than once)  
		System.out.println(Pattern.matches("[ab]+", "aazzb"));//false (z is not matching pattern)  
	}

}