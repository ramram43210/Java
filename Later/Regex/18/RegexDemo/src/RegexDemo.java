import java.util.regex.Pattern;


public class RegexDemo
{
	public static void main(String[] args)
	{
		System.out.println(Pattern.matches("\\d*", "245")); // true
	}

}