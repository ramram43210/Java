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
		 * Where there are two separate matches for the input, we can
		 * have one match but propagating the same regex match to span
		 * the entire length of the input using back referencing:
		 */
		calculateMatches("(\\d\\d)\\1", "3434");
		calculateMatches("(\\d\\d)\\1", "3499");

		calculateMatches("(\\d\\d)\\1\\1", "343434");
		calculateMatches("(\\d\\d)\\1\\1", "343439");

	}

	private static void calculateMatches(String regex,
			String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out.println("Regex = " + regex + " , "
				+ "InputText = " + inputText + " is matching? = "
				+ matcher.matches());
	}

}
