import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * OR Class Example
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * [abc] - Any of the elements in the set is matched
		 */
		calculateMatches("[abc]", "b");
		calculateMatches("[abc]", "cab");
		calculateMatches("[abc]", "caABZ9");

		/*
		 * They can also be alternated as part of a String. In the
		 * following example, when we create different words by
		 * alternating the first letter with each element of the set,
		 * they are all matched:
		 */
		calculateMatches("[bcr]at", "bat cat rat zat");

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
