
public class StringMatcher
{
	/*
	 * returns true if the string matches exactly "true"
	 */
	public boolean isTrue(String s)
	{
		return s.matches("true");
	}

	/*
	 * returns true if the string matches exactly "true" or "True"
	 */
	public boolean isTrueVersion2(String s)
	{
		return s.matches("[tT]rue");
	}

	/*
	 * returns true if the string matches exactly "true" or "True" or "yes" or
	 * "Yes"
	 */
	public boolean isTrueOrYes(String s)
	{
		return s.matches("[tT]rue|[yY]es");
	}

	/*
	 * returns true if the string contains  "true"
	 */
	public boolean containsTrue(String s)
	{
		return s.matches(".*true.*");
	}

}
