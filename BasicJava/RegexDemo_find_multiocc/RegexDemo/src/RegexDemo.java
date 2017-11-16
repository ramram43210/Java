import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Example to find out the multiple occurrences using Matcher methods.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Cat AA Cat AA Cat AAA Cat";
		String regex = "Cat";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputCharSeq);

		/*
		 * Returns: true if, and only if, a subsequence of the input sequence
		 * matches this matcher's pattern
		 */
		while (matcher.find())
		{
			System.out.println("Found at: " + matcher.start() + " - " + matcher.end());
		}
	}

}