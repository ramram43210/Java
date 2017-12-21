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
		isMatch("a{3}", "aaa");
		isMatch("a{3}", "aa");
		isMatch("a{3}", "aaaaaa");
	}

	private static void isMatch(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out.println("Regex = " + regex + " , " + "InputText = "
				+ inputText + " is matching? = " + matcher.matches());
	}

}
