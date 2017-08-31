import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Quantifiers
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		calculateMatches("a{3}", "aaa");
		calculateMatches("a{3}", "aa");
		calculateMatches("a{3}", "aaaaaa");

	}

	private static void calculateMatches(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out.println("Regex = " + regex + " , "
						+ "InputText = " + inputText + " is matching? = "
				+ matcher.matches());
	}

}
