import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Hello peter how are you?";

		String regex = "Hello peter";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputCharSeq);

		/*
		 * The Matcher lookingAt() method works like the matches()
		 * method with one major difference.
		 * 
		 * The lookingAt() method only matches the regular expression
		 * against the beginning of the text, whereas matches()
		 * matches the regular expression against the whole text.
		 * 
		 * In other words, if the regular expression matches the
		 * beginning of a text but not the whole text, lookingAt()
		 * will return true, whereas matches() will return false.
		 */
		System.out.println("lookingAt = " + matcher.lookingAt());
		System.out.println("matches   = " + matcher.matches());
	}

}
