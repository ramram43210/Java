import java.util.regex.Pattern;


public class RegexDemo3
{
	public static void main(String[] args)
	{
		/*
		 *  {X,Y} = Occurs between X and Y times
		 */
		System.out.println(Pattern.matches("\\d{1,4}", "9")); // true
		System.out.println(Pattern.matches("\\d{1,4}", "98")); // true
		System.out.println(Pattern.matches("\\d{1,4}", "9888")); // true
		System.out.println(Pattern.matches("\\d{1,4}", "9898909")); // false
	}

}