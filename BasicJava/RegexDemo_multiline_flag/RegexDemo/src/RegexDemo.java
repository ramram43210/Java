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

		String inputText = "This is a dog"
				+ System.getProperty("line.separator") + "this is a fox";

		System.out.println(inputText);

		/*
		 * Pattern.MULTILINE
		 * 
		 * With out Pattern.MULTILINE flag The match fails because the
		 * matcher searches for dog at the end of the entire String
		 * but the dog is present at the end of the first line of the
		 * string.
		 * 
		 * However, with the Pattern.MULTILINE flag, the same test
		 * will pass since the matcher now takes into account line
		 * terminators. So the String dog is found just before the
		 * line terminates, hence success:
		 */
		calculateMatches("dog$", inputText, Pattern.MULTILINE);
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
