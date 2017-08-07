import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1
{
	private static String REGEX = "lion";
	private static String INPUT = "The lion says meow. " + "All lions say meow.";
	private static String REPLACE = "cat";

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		/*
		 * Returns:The string constructed by replacing each matching subsequence
		 * by the replacement string, substituting captured subsequences as
		 * needed
		 */
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

}