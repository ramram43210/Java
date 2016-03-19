/*
 * public int compareTo(String anotherString)
 *
 * Parameters:
 * ----------
 * anotherString - the String to be compared.
 *
 * Returns:
 * -------
 * the value 0 if the argument string is equal to
 * this string;
 *
 * a value less than 0 if this string
 * is lexicographically less than the string
 * argument;
 *
 * a value greater than 0 if this
 * string is lexicographically greater than the
 * string argument.
 */

public class CompareToDemo
{
	public static void main(String[] args)
	{

		int result = "Welcome".compareTo("Welcome");
		System.out.println("\"Welcome\".compareTo(\"Welcome\") = "
				+ result);

		result = "Hello".compareTo("Welcome");
		System.out.println("\"Hello\".compareTo(\"Welcome\") = "
				+ result);

		result = "Welcome".compareTo("Apple");
		System.out.println("\"Welcome\".compareTo(\"Apple\") = "
				+ result);

	}
}