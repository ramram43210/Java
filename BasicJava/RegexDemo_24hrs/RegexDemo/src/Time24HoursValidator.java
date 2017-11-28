import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * How to validate Time in 24 Hours format with regular expression
 *
 */
public class Time24HoursValidator
{

	private Pattern pattern;
	private Matcher matcher;

	private static final String TIME24HOURS_REGEX = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

	public Time24HoursValidator()
	{
		pattern = Pattern.compile(TIME24HOURS_REGEX);
	}

	public boolean validate(final String time)
	{
		matcher = pattern.matcher(time);
		return matcher.matches();
	}
}
