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
		 * The API also allows us to treat multiple characters as a
		 * single unit through capturing groups.
		 */
		calculateMatches("(\\d\\d)", "12");
		calculateMatches("(\\d\\d)", "123");
		calculateMatches("(\\d\\d)", "a23");

	}

	private static void calculateMatches(String regex,
			String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out.println("is matching? = " + matcher.matches());
	}

}
