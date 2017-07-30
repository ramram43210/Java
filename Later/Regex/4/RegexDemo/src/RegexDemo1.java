import java.util.regex.Pattern;

/**
 * 
 * [abc] = if a or b or c returns true else false.
 *
 */
public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("[abc] matches a = " +   Pattern.matches("[abc]", "a"));
		System.out.println("[abc] matches b = " +   Pattern.matches("[abc]", "b"));
		System.out.println("[abc] matches c = " +   Pattern.matches("[abc]", "c"));
		System.out.println("[abc] matches z = " +   Pattern.matches("[abc]", "z"));
		System.out.println("[abc] matches aa = " +   Pattern.matches("[abc]", "aa"));
		System.out.println("[abc] matches aa = " +   Pattern.matches("[abc]", "abc"));
	}

}