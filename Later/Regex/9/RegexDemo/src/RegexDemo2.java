import java.util.regex.Pattern;

/**
 * 
 * \D = Any non-digit, short for [^0-9]
 *
 */
public class RegexDemo2
{
	public static void main(String[] args)
	{
		System.out.println("metacharacters D..");  
		
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
		System.out.println(Pattern.matches("\\D", "xds"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "8989"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "121abc"));//false (digit and char)  
		
		System.out.println("----------------------------------");
		
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "peter"));//true (non-digit and may come 0 or more times)  
		  
	}

}