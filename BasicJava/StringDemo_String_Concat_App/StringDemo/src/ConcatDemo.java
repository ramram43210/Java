/*
 * public String concat(String str)
 * 
 * Concatenates the specified string to the end of this
 * string.
 * 
 * If the length of the argument string is 0, then this
 * String object is returned. Otherwise, a String object
 * is returned that represents a character sequence that
 * is the concatenation of the character sequence
 * represented by this String object and the character
 * sequence represented by the argument string.
 * 
 * 
 * Parameters: 
 * ----------
 * 
 * str - the String that is concatenated to the end of
 * this String.
 * 
 * Returns: 
 * -------
 * 
 * a string that represents the concatenation of this
 * object's characters followed by the string argument's
 * characters.
 */

public class ConcatDemo
{

	public static void main(String[] args)
	{
		String string1 = "Hello,";
		String string2 = "Peter";

		String string3 = string1.concat(string2);
		System.out.println("string3 = " + string3);

		String string4 = "to".concat("get").concat("her");
		System.out.println("string4 = " + string4);

		/*
		 * Strings are more commonly concatenated with the +
		 * operator.
		 */

		System.out.println("Hello " + " World.");
	}
}
