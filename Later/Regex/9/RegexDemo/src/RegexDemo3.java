import java.util.regex.Pattern;

/**
 * 
 *  . = Any character (may or may not match terminator)
 *
 */
public class RegexDemo3
{
	public static void main(String[] args)
	{
		System.out.println(Pattern.matches(".", "m"));//true [char and comes once]
		System.out.println(Pattern.matches(".", "8"));//true [char and comes once]
		System.out.println(Pattern.matches(".", "99"));//false [char but comes more than once]
		System.out.println(Pattern.matches(".", "uiui"));//false [char but comes more than once]
		  
	}

}