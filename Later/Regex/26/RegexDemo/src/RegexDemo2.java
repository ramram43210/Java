import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2
{
	private static String REGEX = "lion";
	private static String INPUT = "The lion says meow. "
			+ "All lions say meow.";
	private static String REPLACE = "cat";

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		/*
		 * Returns:The string constructed by replacing the first matching
		 * subsequence by the replacement string, substituting captured
		 * subsequences as needed
		 */
		INPUT = m.replaceFirst(REPLACE);
		System.out.println(INPUT);
	}

}