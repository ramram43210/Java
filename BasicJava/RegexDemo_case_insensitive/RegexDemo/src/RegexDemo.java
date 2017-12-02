import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Hello peter";
		String regex = "HELLO PETER";

		/*
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 
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
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputCharSeq);

		System.out.println("CASE_INSENSITIVE matches   = " + matcher.matches());

		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(inputCharSeq);

		System.out.println("CASE_SENSITIVE matches   = " + matcher.matches());
	}

}
