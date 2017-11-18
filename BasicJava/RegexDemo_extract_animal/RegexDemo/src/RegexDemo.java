import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Extracting/Capturing:
 * 
 * Specific values can be selected out of a large complex body of text. These
 * values can be used in the application.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "I have a cat, but I like my dog better.";

		/*
		 * () - group everything within the parenthesis as group 1
		 * 
		 * mouse - match the text ‘mouse’
		 * 
		 * | - alternation: match any one of the sections of this group
		 * 
		 * cat - match the text ‘cat’
		 */

		Pattern pattern = Pattern.compile("(mouse|cat|dog|wolf)");
		Matcher matcher = pattern.matcher(inputCharSeq);

		List<String> animalList = new ArrayList<String>();
		while (matcher.find())
		{
			System.out.println("Found a " + matcher.group() + ".");
			animalList.add(matcher.group());
		}

		System.out.println("animalList = " + animalList);
	}

}