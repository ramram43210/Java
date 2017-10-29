import java.util.regex.Pattern;


public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("X{n} = X occurs n times only");  
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
		System.out.println(Pattern.matches("a{3}", "aaa"));//true (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "aaaaaa"));//false (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "aa"));//false (a should come 3 times) 
		System.out.println(Pattern.matches("a{3}", "a"));//false (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "bbb"));//false (a should come 3 times)
	}

}