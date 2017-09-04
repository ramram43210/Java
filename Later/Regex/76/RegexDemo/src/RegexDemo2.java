import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Logical Operators
 *
 */
public class RegexDemo2
{

	public static void main(String[] args)
	{
		/*
		 * The Logical Operator X|Y matches the X followed by Y.
		 */
		Pattern pattern = Pattern.compile("t|o");
		Matcher matcher = pattern.matcher("Welcome to India");

		while (matcher.find())
		{
			System.out.println(
					"Match String start(): " + matcher.start());
		}
	}

}
