import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * How to validate Time in 12 Hours format with regular expression
 *
 */
public class Time12HoursValidator
{

	private Pattern pattern;
	private Matcher matcher;

	private static final String TIME12HOURS_REGEX = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";

	public Time12HoursValidator()
	{
		pattern = Pattern.compile(TIME12HOURS_REGEX);
	}

	public boolean validate(final String time)
	{
		matcher = pattern.matcher(time);
		return matcher.matches();
	}
}
