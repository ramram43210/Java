import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Modifying/Substitution:
 * 
 * Values in text can be replaced with new values, for example, you could
 * replace all instances of the word ‘PhoneNumber=’, followed by a number, with a
 * mask to hide the original text.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String input = "Peter PhoneNumber=9898988988. Juli PhoneNumber=7777766555";

		Pattern p = Pattern.compile("(PhoneNumber=)(\\d+)");
		Matcher m = p.matcher(input);

		StringBuffer result = new StringBuffer();
		while (m.find())
		{
			System.out.println("Masking: " + m.group(2));
			m.appendReplacement(result, m.group(1) + "***masked***");
		}
		m.appendTail(result);
		System.out.println(result);
	}

}