import java.util.regex.Pattern;

/**
 * 
 * \d = Any digits, short of [0-9]
 *
 */

public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("metacharacters d");
		
		System.out.println(Pattern.matches("\\d", "9"));//true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "dfg"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "8888"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "555abc"));//false (digit and char)  
		
		System.out.println("----------------------------------");
		
		System.out.println("metacharacters d with quantifier....");  
		System.out.println(Pattern.matches("\\d*", "56565"));//true (non-digit and may come 0 or more times)
	}

}