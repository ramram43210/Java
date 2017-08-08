import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		String text = "Peter Welcome to India.";

		String pattern = ".*Welcome.*";

		boolean isMatch = Pattern.matches(pattern, text);
		System.out.println("The text contains 'Welcome'? " + isMatch);
	}

}