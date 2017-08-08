import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2
{

	public static void main(String[] args)
	{
		String text = "Peter Welcome to India.";

		String regex = ".*WElCoMe.*";

		/*
		 * Returns:the given regular expression compiled into a pattern with the
		 * given flags
		 */
		Pattern patternObj = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		/*
		 * Returns:A new matcher for this pattern
		 */
		Matcher matcher = patternObj.matcher(text);
		/*
		 * Returns:true if, and only if, the entire region sequence matches this
		 * matcher's pattern
		 */
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match? = " + isMatched);
	}

}