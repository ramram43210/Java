import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Boundary Matchers
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{

		/*
		 * If we want a match only when the required text is found at
		 * a word boundary, we use \\b regex at the beginning and end
		 * of the regex:
		 */
		calculateMatches("\\bdog\\b", "a dog is friendly");
		calculateMatches("\\bdog\\b", "dog is man's best friend,dog is good");
		calculateMatches("\\bdog\\b", "snoop dogg is a rapper");

		/*
		 * Two-word characters appearing in a row does not mark a word
		 * boundary, but we can make it pass by changing the end of
		 * the regex to look for a non-word boundary:
		 */
		calculateMatches("\\bdog\\B", "snoop dogg is a rapper");
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
