import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{

	private static String REGEX = "dog$";
	private static String INPUT = "The dog$ says meow All dog$ say meow.";
	private static String REPLACE = "cat";

	public static void main(String[] args)
	{
		/*
		 * Returns:A literal string replacement
		 */
		String literalPatternStr = Pattern.quote(REGEX);
		System.out.println("literalPatternStr = "+literalPatternStr);
		Pattern pattern = Pattern.compile(literalPatternStr);

		// get a matcher object
		Matcher matcher = pattern.matcher(INPUT);
		INPUT = matcher.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

}
