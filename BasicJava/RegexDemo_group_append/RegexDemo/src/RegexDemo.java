import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * appendReplacement() and appendTail():
 * 
 * The Matcher appendReplacement() and appendTail() methods are used
 * to replace string tokens in an input text, and append the resulting
 * string to a StringBuffer.
 * 
 * When you have found a match using the find() method, you can call
 * the appendReplacement(). Doing so results in the characters from
 * the input text being appended to the StringBuffer, and the matched
 * text being replaced. Only the characters starting from then end of
 * the last match, and until just before the matched characters are
 * copied.
 * 
 * The appendReplacement() method keeps track of what has been copied
 * into the StringBuffer, so you can continue searching for matches
 * using find() until no more matches are found in the input text.
 * 
 * Once the last match has been found, a part of the input text will
 * still not have been copied into the StringBuffer. This is the
 * characters from the end of the last match and until the end of the
 * input text. By calling appendTail() you can append these last
 * characters to the StringBuffer too.
 *
 * 
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String text = "John writes about this, and John Doe writes about that,"
				+ " and John Wayne writes about everything.";

		String regex = "(John) ";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		StringBuffer stringBuffer = new StringBuffer();

		while (matcher.find())
		{
			matcher.appendReplacement(stringBuffer, "Peter ");
			System.out.println(stringBuffer.toString());
		}
		matcher.appendTail(stringBuffer);

		System.out.println(stringBuffer.toString());
	}

}
