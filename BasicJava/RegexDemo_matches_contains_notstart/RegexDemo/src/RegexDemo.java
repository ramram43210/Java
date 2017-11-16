import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * returns true if the string contains "abc" at any place
		 */
		System.out.println(Pattern.matches(".*abc.*", "deabcpq"));// True
		
		System.out.println("------------------------------------");

		/*
		 * returns true if the string does not have a number at the beginning
		 */
		System.out.println(Pattern.matches("^[^\\d].*", "123abc")); // False
		System.out.println(Pattern.matches("^[^\\d].*", "abc123")); // True
		
		System.out.println("------------------------------------");

		// returns true if the string contains of three letters
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));// True
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));// True
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));// False

	}

}