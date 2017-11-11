import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1
{
	private static String REGEX = "lion";
	private static String INPUT = "The lion says meow. All lions say meow.";
	private static String REPLACE = "cat";

	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		/*
		 * Parameters:
		 * 
		 * replacement - The replacement string
		 * 
		 * Returns: 
		 * 
		 * The string constructed by replacing each matching
		 * subsequence by the replacement string, substituting
		 * captured subsequences as needed
		 */
		INPUT = matcher.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

}