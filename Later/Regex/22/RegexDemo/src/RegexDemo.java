/**
 * Write a regular expression which matches any phone number
 */

public class RegexDemo
{
	public static void main(String[] args)
	{
		String pattern = "\\d\\d\\d([-]){1}\\d\\d\\d([-]){1}\\d\\d\\d\\d";

		String phoneNum1 = "123-332-9999";
		System.out.println(phoneNum1.matches(pattern));// true

		String phoneNum2 = "1233329999";
		System.out.println(phoneNum2.matches(pattern));// false
	}

}