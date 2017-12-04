import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Meta Characters example
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * Meta characters affect the way a pattern is matched, in a
		 * way adding logic to the search pattern. The Java API
		 * supports several metacharacters, the most straightforward
		 * being the dot “.” which matches any character:
		 */
		calculateMatches(".", "foofoo");
		/*
		 * Notice the dot after the foo in the regex. The matcher
		 * matches every text that is preceded by foo since the last
		 * dot part means any character after. So after finding the
		 * first foo, the rest is seen as any character. That is why
		 * there is only a single match.
		 */
		calculateMatches("foo.", "foofoo");
	}

	private static void calculateMatches(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
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
