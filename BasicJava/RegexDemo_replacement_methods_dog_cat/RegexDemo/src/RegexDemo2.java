import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Replacement Methods
 *
 */
public class RegexDemo2
{

	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("dog");
		Matcher matcher = pattern
				.matcher("dogs are domestic animals, dogs are friendly");

		/*
		 * Replacement methods are useful to replace text in an input
		 * string. The common ones are replaceFirst and replaceAll.
		 * 
		 * The replaceFirst and replaceAll methods replace the text
		 * that matches a given regular expression. As their names
		 * indicate, replaceFirst replaces the first occurrence, and
		 * replaceAll replaces all occurrences.
		 */
		String newStr = matcher.replaceAll("cat");
		System.out.println(newStr);
	}

}
