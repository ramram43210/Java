import java.util.regex.Matcher;
import java.util.regex.Pattern;

There are three ways to write the regex example in java.

public class RegexDemo1
{
	public static void main(String[] args)
	{
		/*
		 * . represents single character
		 *
		 * Compiles the given regular expression into a pattern.
		 */
		Pattern pattern = Pattern.compile(".r");
		/*
		 * Creates a matcher that will match the given input against this
		 * pattern.
		 */
		Matcher matcher = pattern.matcher("br");
		/*
		 * Returns:true if, and only if, the entire region sequence matches this
		 * matcher's pattern
		 */
		boolean result = matcher.matches();
		System.out.println(result);
	}

}