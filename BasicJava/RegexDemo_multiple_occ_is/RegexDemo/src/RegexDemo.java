import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java regex example which uses the Matcher class to locate multiple
 * occurrences of the substring "is" inside a text: *
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "This is the text which is to be searched "
				+ "for occurrences of the word 'is'.";

		String regex = "is";

		/*
		 * Compiles the given regular expression into a pattern.
		 */
		Pattern pattern = Pattern.compile(regex);
		/*
		 * Returns:A new matcher for this pattern
		 */
		Matcher matcher = pattern.matcher(inputCharSeq);

		int count = 0;
		/*
		 * Returns:true if, and only if, a subsequence of the input
		 * sequence matches this matcher's pattern
		 */
		while (matcher.find())
		{
			count++;
			System.out.println("found: " + count + " : "
					+ matcher.start() + " - " + matcher.end());
		}

	}

}
