import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 *  returns true if the string contains 0 or more non-digits
		 */
		System.out.println(Pattern.matches("\\D*", "abcde")); // True
		System.out.println(Pattern.matches("\\D*", "abcde123")); // False

		System.out.println("----------------------------------");
		
		/*
		 * Boundary Matchers example ^ denotes start of the line $ denotes end
		 * of the line
		 */
		System.out.println(Pattern.matches("^This$", "This is Chaitanya")); // False
		System.out.println(Pattern.matches("^This$", "This")); // True
		System.out.println(Pattern.matches("^This$", "Is This Chaitanya")); // False

	}

}