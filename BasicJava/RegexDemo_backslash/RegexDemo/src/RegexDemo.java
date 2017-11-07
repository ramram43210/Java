import java.util.regex.Pattern;

public class RegexDemo
{
	public static void main(String[] args)
	{
		/*
		 * If you want to define \d, then you must be using \\d in
		 * your regex.
		 */
		System.out.println(Pattern.matches("\\d*", "245")); // true
	}

}