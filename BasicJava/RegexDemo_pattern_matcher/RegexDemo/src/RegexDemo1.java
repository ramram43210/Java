import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1
{
	public static void main(String[] args)
	{
		/*
		 * . represents single character
		 *
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 
		 * Returns:
		 * 
		 * the given regular expression compiled into a pattern
		 */
		Pattern pattern = Pattern.compile(".r");
		/*
		 * Parameters: 
		 * 
		 * input - The character sequence to be matched
		 * 
		 * Returns: 
		 * 
		 * A new matcher for this pattern
		 * 
		 */
		Matcher matcher = pattern.matcher("br");
		/*
		 * Returns:true if, and only if, the entire region sequence
		 * matches this matcher's pattern
		 */
		boolean result = matcher.matches();
		System.out.println(result);
	}

}