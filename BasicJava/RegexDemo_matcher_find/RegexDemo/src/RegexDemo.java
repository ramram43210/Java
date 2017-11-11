import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{
	public static void main(String[] args)
	{
		String input = "TV Price is 500 Rs";
		String regex = "(.*)(\\d+)(.*)";

		/*
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 
		 * Returns:
		 * 
		 * the given regular expression compiled into a pattern
		 * 
		 */
		Pattern patternObj = Pattern.compile(regex);

		/*
		 * Parameters:
		 * 
		 * input - The character sequence to be matched
		 * 
		 * Returns:
		 * 
		 * A new matcher for this pattern
		 */
		Matcher matcher = patternObj.matcher(input);
		/*
		 * Returns:
		 * 
		 * true if, and only if, a subsequence of the input sequence
		 * matches this matcher's pattern
		 */
		System.out.println(matcher.find());
	}

}