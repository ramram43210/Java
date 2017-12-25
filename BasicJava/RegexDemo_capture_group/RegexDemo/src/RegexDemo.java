import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Capturing Groups
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{

		/*
		 * The API also allows us to treat multiple digits as a
		 * single unit through capturing groups.
		 */
		isMatch("(\\d\\d)", "12");
		isMatch("(\\d\\d)", "123");
		isMatch("(\\d\\d)", "a2");

	}

	private static void isMatch(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out.println("Regex = " + regex + " , " + "InputText = "
				+ inputText + " is matching? = " + matcher.matches());
	}

}
