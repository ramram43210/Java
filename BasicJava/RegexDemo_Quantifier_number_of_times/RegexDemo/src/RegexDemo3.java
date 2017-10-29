import java.util.regex.Pattern;

public class RegexDemo3
{
	public static void main(String[] args)
	{
		System.out.println("X{y,z} = X occurs at least y times but less than or equal to z times");  
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
		System.out.println(Pattern.matches("a{3,6}", "aaa"));//true (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "aaaaaa"));//true (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "aaaaaaaaaaa"));//false (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "aa"));//false (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "a"));//false (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "bbb"));//false (a can come 3 times or <= 6 times)
	}

}