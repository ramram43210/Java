import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Intersection Class
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * We will get 4 matches because the intersection of the two
		 * sets has only 4 elements[3456].
		 */
		calculateMatches("[1-6&&[3-9]]", "3456");
		calculateMatches("[1-6&&[3-9]]", "123456789");
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
