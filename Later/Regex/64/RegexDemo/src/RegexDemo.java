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
		calculateMatches("a{2,3}", "aa");
		calculateMatches("a{2,3}", "aaa");
		calculateMatches("a{2,3}", "a");
		calculateMatches("a{2,3}", "aaaaaa");

	}

	private static void calculateMatches(String regex,String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		System.out
				.println("is matching? = " + matcher.matches());
	}

}
