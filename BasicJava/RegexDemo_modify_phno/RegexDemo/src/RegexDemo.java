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
		String inputCharSeq = "Peter PhoneNumber=9898988988. Juli PhoneNumber=7777766555";

		Pattern pattern = Pattern.compile("(PhoneNumber=)(\\d+)");
		Matcher matcher = pattern.matcher(inputCharSeq);

		StringBuffer sb = new StringBuffer();
		while (matcher.find())
		{
			System.out.println("Masking: " + matcher.group(2));
			matcher.appendReplacement(sb, matcher.group(1) + "***masked***");
		}
		matcher.appendTail(sb);
		System.out.println(sb);
	}

}