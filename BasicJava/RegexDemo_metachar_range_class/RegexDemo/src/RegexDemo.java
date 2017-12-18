import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * Range Class Example
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * Matching uppercase letters:
		 */
		calculateMatches( "[A-Z]", "Welcome To India");
		/*
		 * Matching lowercase letters:
		 */
		calculateMatches( "[a-z]", "Two");
		/*
		 * Matching both upper case and lower case letters:
		 */
		calculateMatches("[a-zA-Z]", "Two");
		/*
		 * Matching a given range of numbers:
		 */
		calculateMatches( "[1-5]", "hi 65");
		
	}

	private static void calculateMatches(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		int matches = 0;

		/*
		 * The find method keeps advancing through the input text and
		 * returns true for every match, so we can use it to find the
		 * match count as well:
		 */
		while (matcher.find())
		{
			++matches;
		}
		System.out.println("Number of Matches = " + matches);
	}

}
