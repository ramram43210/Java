import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * This example searches the text for occurrences of the word John.
 * For each match found, group number 1 is extracted, which is what
 * matched the group marked with parentheses.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String text = "John writes about this, and John writes about that,"
				+ " and John writes about everything. ";

		/*
		 * Groups are marked with parentheses in the regular
		 * expression.
		 * 
		 * This regular expression matches the text John. The
		 * parentheses are not part of the text that is matched. The
		 * parentheses mark a group. When a match is found in a text,
		 * you can get access to the part of the regular expression
		 * inside the group.
		 */
		String regex = "(John)";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find())
		{
			/*
			 * We access a group using the group(int groupNo) method.
			 * A regular expression can have more than one group. Each
			 * group is thus marked with a separate set of
			 * parentheses. To get access to the text that matched the
			 * subpart of the expression in a specific group, pass the
			 * number of the group to the group(int groupNo) method.
			 * 
			 * The group with number 0 is always the whole regular
			 * expression. To get access to a group marked by
			 * parentheses you should start with group numbers 1.
			 */
			System.out.println("found: " + matcher.group(1) + " , start: "
					+ matcher.start() + ", end: " + matcher.end());
		}
	}

}
