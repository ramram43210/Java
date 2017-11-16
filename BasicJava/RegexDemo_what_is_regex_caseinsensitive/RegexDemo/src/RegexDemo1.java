import java.util.regex.Pattern;

public class RegexDemo1
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Peter Welcome to India.";

		String regex = ".*Welcome.*";

		/*
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 
		 * input - The character sequence to be matched
		 * 
		 * Returns: 
		 * 
		 * whether or not the regular expression matches on
		 * the input
		 * 
		 */
		boolean isMatch = Pattern.matches(regex, inputCharSeq);
		System.out.println("The text contains 'Welcome'? = " + isMatch);
	}

}