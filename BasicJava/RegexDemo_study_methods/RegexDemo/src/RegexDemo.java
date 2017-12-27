import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Study Methods
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("dog");
		Matcher matcher = pattern.matcher("dog is friendly");

		/*
		 * Study methods go through the input String and return a
		 * boolean indicating whether or not the pattern is found.
		 * Commonly used are matches and lookingAt methods.
		 * 
		 * The matches and lookingAt methods both attempt to match an
		 * input sequence against a pattern. The difference, is that
		 * matches requires the entire input sequence to be matched,
		 * while lookingAt does not.
		 */
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.matches());
	}

}
