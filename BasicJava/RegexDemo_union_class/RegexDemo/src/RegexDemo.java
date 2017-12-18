import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Union Class
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * This will only match 6 out of the 9 integers because the
		 * union set skips  4,5 and 6.
		 */
		calculateMatches("[1-3[7-9]]", "123456789");
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
