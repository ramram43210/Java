import java.util.regex.Pattern;

/**
 * 
 * [^abc] = if any character except a or b or c returns true else false.
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
		
		System.out.println("[^abc] matches a = " +   Pattern.matches("[^abc]", "a"));
		System.out.println("[^abc] matches b = " +   Pattern.matches("[^abc]", "b"));
		System.out.println("[^abc] matches c = " +   Pattern.matches("[^abc]", "c"));
		System.out.println("[^abc] matches z = " +   Pattern.matches("[^abc]", "z"));
		System.out.println("[^abc] matches zz = " +   Pattern.matches("[^abc]", "zz"));
		System.out.println("[^abc] matches zzz = " +   Pattern.matches("[^abc]", "zzz"));
	}

}