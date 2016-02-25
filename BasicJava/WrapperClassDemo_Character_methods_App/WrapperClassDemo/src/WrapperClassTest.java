public class WrapperClassTest
{

	public static void main(String[] args)
	{
		/*
		 * Determines whether the specified char value is a
		 * letter.
		 */
		boolean isLetter = Character.isLetter('a');
		System.out.println("Character.isLetter('a') = " + isLetter);

		/*
		 * Determines whether the specified char value is a
		 * digit.
		 */
		boolean isDigit = Character.isDigit('2');
		System.out.println("Character.isDigit('2')  = " + isDigit);

		/*
		 * Determines whether the specified char value is
		 * white space.
		 */
		boolean isWhiteSpace = Character.isWhitespace(' ');
		System.out.println("Character.isWhitespace(' ')  = "
				+ isWhiteSpace);

		/*
		 * Determines whether the specified char value is
		 * uppercase.
		 */
		boolean isUpperCase = Character.isUpperCase('A');
		System.out.println("Character.isUpperCase('A')  = "
				+ isUpperCase);

		/*
		 * 
		 * Determines whether the specified char value is
		 * lowercase.
		 */
		boolean isLowerCase = Character.isLowerCase('a');
		System.out.println("Character.isLowerCase('a')  = "
				+ isLowerCase);

		/*
		 * Returns the uppercase form of the specified char
		 * value.
		 */
		System.out.println("Character.toUpperCase('m') = "
				+ Character.toUpperCase('m'));

		/*
		 * Returns the lowercase form of the specified char
		 * value.
		 */
		System.out.println("Character.toLowerCase('B') = "
				+ Character.toLowerCase('B'));

		/*
		 * Returns a String object representing the
		 * specified character value — that is, a
		 * one-character string.
		 */
		String str = Character.toString('u');
		System.out.println("Character.toString('u') = " + str);

	}

}
