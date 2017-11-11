import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * This example that counts the number of times the word "dog" appears in the
 * input string
 *
 */
public class RegexDemo
{
	private static final String REGEX = "\\bdog\\b";
	private static final String INPUT = "dog dog dog dogiee dog";

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // get a matcher object
		int count = 0;

		/*
		 * Returns:true if, and only if, a subsequence of the input sequence
		 * matches this matcher's pattern
		 */
		while (m.find())
		{
			count++;
			System.out.println("Match number " + count);
			/*
			 * Returns the start index of the previous match.
			 */
			System.out.println("start(): " + m.start());
			/*
			 * Returns the offset after the last character matched.
			 */
			System.out.println("end(): " + m.end());
			System.out.println("---------------------");
		}
	}

}