import java.util.regex.Pattern;

/**
 * 
 * [a-zA-Z] = Means any character that IS a-d OR m-p.
 *
 */
public class RegexDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * regex - The expression to be compiled
		 * 
		 * input - The character sequence to be matched
		 * 
		 * Returns:
		 * 
		 * whether or not the regular expression matches on the input
		 * 
		 */
		System.out.println("[a-d[m-p]] matches a = " +   Pattern.matches("[a-d[m-p]]", "a"));
		System.out.println("[a-d[m-p]] matches n = " +   Pattern.matches("[a-d[m-p]]", "n"));
		System.out.println("[a-d[m-p]] matches e = " +   Pattern.matches("[a-d[m-p]]", "e"));
		System.out.println("[a-d[m-p]] matches A = " +   Pattern.matches("[a-d[m-p]]", "A"));
		System.out.println("[a-d[m-p]] matches am = " +   Pattern.matches("[a-d[m-p]]", "am"));
	}

}