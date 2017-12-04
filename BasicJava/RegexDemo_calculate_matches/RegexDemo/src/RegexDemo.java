import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		calculateMatches("foo", "foo come foo");
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
		System.out.println("Number of Matches = "+matches);
	}

}
