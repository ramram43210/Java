import java.util.regex.Pattern;

/**
 * 
 * [a-z&&[^m-p]] = a through z, and not m through p
 *
 */
public class RegexDemo3
{
	public static void main(String[] args)
	{
		System.out.println("[a-z&&[^m-p]] matches b = " +   Pattern.matches("[a-z&&[^m-p]]", "b"));
		System.out.println("[a-z&&[^m-p]] matches o = " +   Pattern.matches("[a-z&&[^m-p]]", "o"));
		System.out.println("[a-z&&[^m-p]] matches bb = " +   Pattern.matches("[a-z&&[^m-p]]", "bb"));
	}

}