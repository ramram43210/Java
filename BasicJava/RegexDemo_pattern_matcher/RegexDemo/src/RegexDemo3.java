import java.util.regex.Pattern;

/**
 * boolean java.util.regex.Pattern.matches(String regex, CharSequence
 * input)
 * 
 * Compiles the given regular expression and attempts to match the
 * given input against it
 */
public class RegexDemo3
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * regex: The expression to be compiled
		 * 
		 * input: The character sequence to be matched
		 * 
		 * Returns:
		 * 
		 * whether or not the regular expression matches on
		 * the input
		 */
		boolean result = Pattern.matches(".r", "ar");
		System.out.println(result);
	}

}