import java.util.regex.Pattern;

/**
 * 
 * To split a text into multiple strings based on a delimiter (Here delimiter
 * would be specified using regex), we can use Pattern.split() method.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Peter_Welcome_to_india";
		
		// Pattern for delimiter
		String regex = "_";
		
		Pattern pattern = Pattern.compile(regex);
		/*
		 * Returns:The array of strings computed by splitting the input around
		 * matches of this pattern.
		 */
		String[] stringArray = pattern.split(inputCharSeq);
		
		for (String str : stringArray)
		{
			System.out.println(str);
		}
		System.out.println("Number of split strings: " + stringArray.length);
	}

}