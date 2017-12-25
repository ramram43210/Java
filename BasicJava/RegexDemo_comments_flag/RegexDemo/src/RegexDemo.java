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
		 * Pattern.COMMENTS
		 * 
		 * when we use the flag, it will ignore the extra spaces and
		 * the every text starting with # will be seen as a comment to
		 * be ignored for each line:
		 */
		calculateMatches("dog$  #check end of text", "This is a dog",
				Pattern.COMMENTS);
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
