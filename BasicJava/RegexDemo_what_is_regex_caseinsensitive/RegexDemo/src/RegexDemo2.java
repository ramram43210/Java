import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Peter Welcome to India.";

		String regex = ".*WElCoMe.*";

		/*
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 		 * 
		 * flags - Match flags, a bit mask that may include
		 * CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE,
		 * CANON_EQ, UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS and
		 * COMMENTS
		 * 
		 * Returns:
		 * 
		 * the given regular expression compiled into a pattern with
		 * the given flags
		 * 
		 */
		Pattern patternObj = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		/*
		 * Parameters: 
		 * 
		 * input - The character sequence to be matched
		 * 
		 * Returns:
		 * 
		 * A new matcher for this pattern
		 */
		Matcher matcher = patternObj.matcher(inputCharSeq);
		/*
		 * Returns:true if, and only if, the entire region sequence matches this
		 * matcher's pattern
		 */
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match? = " + isMatched);
	}

}