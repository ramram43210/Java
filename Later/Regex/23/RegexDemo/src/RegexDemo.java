import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{
	public static void main(String[] args)
	{
		String line = "TV Price is 500 Rs";
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern patternObj = Pattern.compile(pattern);

		Matcher matcher = patternObj.matcher(line);
		System.out.println(matcher.find());
	}

}