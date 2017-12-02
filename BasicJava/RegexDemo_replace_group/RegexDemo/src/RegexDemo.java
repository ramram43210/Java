import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * replaceAll() and replaceFirst():
 * 
 * The Matcher replaceAll() and replaceFirst() methods can be used to
 * replace parts of the string the Matcher is searching through.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String text = "John peter about this, and John Doe writes about that,"
				+ " and John Wayne writes about everything.";

		String regex = "(John)";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		/*
		 * The replaceAll() method replaces all matches of the regular
		 * expression.
		 */
		String replaceAll = matcher.replaceAll("Steve");
		System.out.println("replaceAll   = " + replaceAll);

		/*
		 * The replaceFirst() only replaces the first match.
		 */
		String replaceFirst = matcher.replaceFirst("Steve");
		System.out.println("replaceFirst = " + replaceFirst);
	}

}
