import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Index Methods
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("dog");
		Matcher matcher = pattern.matcher("This dog is mine");

		while (matcher.find())
		{

			/*
			 * Index methods provide useful index values that show
			 * precisely where the match was found in the input String
			 * . In the following test, we will confirm the start and
			 * end indices of the match for dog in the input String.
			 */
			System.out.println("Starting position = " + matcher.start());
			System.out.println("Ending position = " + matcher.end());
		}
	}

}
