public class RegexDemo
{
	public static void main(String[] args)
	{
		StringMatcher stringMatcher = new StringMatcher();

		System.out.println(stringMatcher.isTrue("true")); // true
		System.out.println(stringMatcher.isTrue("True")); // false

		System.out.println("-----------------------------");

		System.out.println(stringMatcher.isTrueVersion2("true")); // true
		System.out.println(stringMatcher.isTrueVersion2("True")); // true
		System.out.println(stringMatcher.isTrueVersion2("True1")); // false

		System.out.println("-----------------------------");

		System.out.println(stringMatcher.isTrueOrYes("true")); // true
		System.out.println(stringMatcher.isTrueOrYes("Yes")); // true
		System.out.println(stringMatcher.isTrueOrYes("yes")); // true

		System.out.println("-----------------------------");

		System.out.println(stringMatcher.containsTrue("Hellotrue")); // true
		System.out.println(stringMatcher.containsTrue("WelcometrueWelcome")); // true
		System.out.println(stringMatcher.containsTrue("WelcometrWelcome")); // false

	}

}