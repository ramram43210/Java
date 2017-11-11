
public class StringMatcher
{
	/*
	 * returns true if the string contains of three letters
	 */
	public boolean isThreeLetters(String s)
	{
		return s.matches("[a-zA-Z]{3}");
	}

	/*
	 * returns true if the string does not have a number at the beginning
	 */
	public boolean isNoNumberAtBeginning(String s)
	{
		return s.matches("^[^\\d].*");
	}

}
