import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Flags
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * Pattern.CASE_INSENSITIVE
		 * 
		 * This flag enables matching regardless of case. By default
		 * matching takes case into account
		 * 
		 * So using this flag, we can change the default behavior:
		 */
		calculateMatches("dog", "This is a DOG", Pattern.CASE_INSENSITIVE);
	}

	private static void calculateMatches(String regex, String inputText,
			int flag)
	{
		Pattern pattern = Pattern.compile(regex, flag);
		Matcher matcher = pattern.matcher(inputText);
		int matches = 0;

		/*
		 * The find method keeps advancing through the input text and
		 * returns true for every match, so we can use it to find the
		 * match count as well:
		 */
		while (matcher.find())
		{
			++matches;
		}
		System.out.println("Number of Matches = " + matches);
	}

}
