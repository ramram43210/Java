import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{
	private static final String REGEX = "bar";
	private static final String INPUT = "barooooooooooooooo";

	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);

		System.out.println("REGEX is: " + REGEX);
		System.out.println("INPUT is: " + INPUT);

		/*
		 * Returns:true if, and only if, a prefix of the input sequence matches
		 * this matcher's pattern.
		 */
		System.out.println("lookingAt(): " + matcher.lookingAt());
		
		/*
		 * Returns:true if, and only if, the entire region sequence matches this
		 * matcher's pattern
		 */
		System.out.println("matches(): " + matcher.matches());
	}

}