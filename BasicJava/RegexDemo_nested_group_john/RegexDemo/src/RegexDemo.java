import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Groups Inside Groups
 * 
 * It is possible to have groups inside group in a regular
 * expression.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String text = "John writes about this, and John Doe writes about that,"
				+ " and John Wayne writes about everything.";

		/*
		 * Notice how the two groups from the examples earlier are now
		 * nested inside a larger group. (again, you cannot see the
		 * space at the end of the expression, but it is there).
		 * 
		 * When groups are nested inside each other, they are numbered
		 * based on when the left paranthesis of the group is met.
		 * Thus, group 1 is the big group. Group 2 is the group with
		 * the expression John inside. Group 3 is the group with the
		 * expression .+? inside. This is important to know when you
		 * need to reference the groups via the groups(int groupNo)
		 * method.
		 */

		String regex = "((John) (.+?)) ";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find())
		{
			System.out.println("Group1 = "+matcher.group(1));
			System.out.println("Group2 = "+matcher.group(2));
			System.out.println("Group3 = "+matcher.group(3));
			System.out.println("--------------------------------");
		}
	}

}
