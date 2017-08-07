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
	private static String REGEX = "a*b";
	private static String INPUT = "aabfooaabfooabfoob";
	private static String REPLACE = "-";

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile(REGEX);

		Matcher m = p.matcher(INPUT);
		StringBuffer sb = new StringBuffer();
		while (m.find())
		{
			m.appendReplacement(sb, REPLACE);
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}

}