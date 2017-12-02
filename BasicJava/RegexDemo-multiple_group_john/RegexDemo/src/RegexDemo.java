import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Multiple Groups:
 * A regular expression can have multiple groups.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String text = "John writes about this, and John Doe writes about that,"
				+ " and John Wayne writes about everything.";

		/*
		 * This expression matches the text "John" followed by a
		 * space, and then one or more characters.
		 *
		 * This expression contains a few characters with special
		 * meanings in a regular expression. The . means
		 * "any character". The + means "one or more times", and
		 * relates to the . (any character, one or more times). The ?
		 * means "match as small a number of characters as possible".
		 */
		String regex = "(John) (.+?) ";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find())
		{
			System.out.println("found: " + matcher.group(1) + " "
					+ matcher.group(2));
		}

	}

}
