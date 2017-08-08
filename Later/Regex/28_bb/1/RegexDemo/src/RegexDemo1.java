import java.util.regex.Pattern;

public class RegexDemo1
{

	public static void main(String[] args)
	{
		String text = "Peter Welcome to India.";

		String regex = ".*Welcome.*";

		/*
		 * Returns:whether or not the regular expression matches on the input
		 */
		boolean isMatch = Pattern.matches(regex, text);
		System.out.println("The text contains 'Welcome'? = " + isMatch);
	}

}