import java.util.regex.Pattern;

/**
 * 
 * [a-zA-Z] : Means any character that IS a-z OR A-Z
 *
 */
public class RegexDemo1
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
		System.out.println("[a-zA-Z] matches A = " +   Pattern.matches("[a-zA-Z]", "A"));
		System.out.println("[a-zA-Z] matches d = " +   Pattern.matches("[a-zA-Z]", "d"));
		System.out.println("[a-zA-Z] matches ddZY = " +   Pattern.matches("[a-zA-Z]", "ddZY"));
		System.out.println("[a-zA-Z] matches 1 = " +   Pattern.matches("[a-zA-Z]", "1"));
	}

}