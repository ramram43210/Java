import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * The inputText variable contains the text to be checked with
		 * the regular expression.
		 */
		String inputText = "This is the text to be searched "
				+ "for occurrences of the http:// pattern.";

		/*
		 * The regular expression matches all texts which contains one
		 * or more characters (.*) followed by the text http://
		 * followed by one or more characters (.*).
		 */
		String regex = ".*http://.*";

		/*
		 * the Pattern.matches() static method to check if the regular
		 * expression (pattern) matches the text. If the regular
		 * expression matches the text, then Pattern.matches() returns
		 * true. If the regular expression does not match the text
		 * Pattern.matches() returns false.
		 */
		boolean matches = Pattern.matches(regex, inputText);

		System.out.println("matches = " + matches);

	}

}
