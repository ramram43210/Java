/**
 * Write a regular expression which matches any phone number
 */

public class RegexDemo
{
	public static void main(String[] args)
	{
		String regex = "\\d\\d\\d([-]){1}\\d\\d\\d([-]){1}\\d\\d\\d\\d";

		String phoneNum1 = "123-332-9999";
		System.out.println(phoneNum1.matches(regex));// true

		String phoneNum2 = "1233329999";
		System.out.println(phoneNum2.matches(regex));// false
	}

}