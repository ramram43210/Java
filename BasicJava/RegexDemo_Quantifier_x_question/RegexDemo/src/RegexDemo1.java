import java.util.regex.Pattern;


public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("? quantifier = occurs once or not at all");  
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
		System.out.println(Pattern.matches("[ab]?", "a"));//true (a or b comes one time) 
		System.out.println(Pattern.matches("[ab]?", "b"));//true (a or b comes one time)
		System.out.println(Pattern.matches("[ab]?", ""));//true (occurs once or not at all)
		System.out.println(Pattern.matches("[ab]?", "ab"));//false (a and b comes one time)
		System.out.println(Pattern.matches("[ab]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[ab]?", "aabbb"));//false (a and b comes more than one time)  
	}

}