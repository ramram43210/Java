import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * The Matcher class provides appendReplacement and appendTail methods for text
 * replacement.
 *
 */
public class RegexDemo
{
	private static String REGEX = "aa";
	private static String INPUT = "aafooaafooaafooaa";
	private static String REPLACE = "-";

	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		
		StringBuffer sb = new StringBuffer();
		while (matcher.find())
		{
			/*
			 * Parameters:
			 * 
			 * sb - The target string buffer 
			 * replacement - The replacement string
			 * 
			 * Returns: This matcher
			 * 
			 */
			matcher.appendReplacement(sb, REPLACE);
		}
		matcher.appendTail(sb);
		System.out.println(sb.toString());
	}

}