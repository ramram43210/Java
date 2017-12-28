import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Logical Operators
 *
 */
public class RegexDemo1
{

	public static void main(String[] args)
	{
		/*
		 * The Logical Operator XY matches the X followed by Y.
		 */
		Pattern pattern = Pattern.compile("to");
		Matcher matcher = pattern.matcher("Welcome to India");

		while (matcher.find())
		{
			System.out.println(matcher.group() + ", Match String start(): "
					+ matcher.start());
		}
	}

}
