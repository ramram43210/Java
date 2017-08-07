public class RegexDemo
{
	public static void main(String[] args)
	{
		StringMatcher stringMatcher = new StringMatcher();

		System.out.println(stringMatcher.isThreeLetters("cat")); // true
		System.out.println(stringMatcher.isThreeLetters("tiger")); // false

		System.out.println("-----------------------------");

		System.out.println(stringMatcher.isNoNumberAtBeginning("Hello")); // true
		System.out.println(stringMatcher.isNoNumberAtBeginning("9Hello")); // false

	}

}