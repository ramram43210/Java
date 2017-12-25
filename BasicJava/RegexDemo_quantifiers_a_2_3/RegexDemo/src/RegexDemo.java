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

		/*
		 * We’ve specified at least two occurrences but not exceeding
		 * three.
		 */
		isMatch("a{2,3}", "aa");
		isMatch("a{2,3}", "aaa");
		isMatch("a{2,3}", "a");
		isMatch("a{2,3}", "aaaaaa");

	}

	private static void isMatch(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out.println("Regex = " + regex + " , " + "InputText = "
				+ inputText + " is matching? = " + matcher.matches());
	}

}
