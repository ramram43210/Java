import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * How to validate username with regular expression
 *
 */
public class UserNameValidator
{
	private Pattern pattern;
	private Matcher matcher;

	private static final String USERNAME_REGEX = "^[a-z0-9_-]{3,15}$";

	public UserNameValidator()
	{
		pattern = Pattern.compile(USERNAME_REGEX);
	}

	/*
	 * Validate username with regular expression
	 * 
	 * @param username username for validation
	 * 
	 * @return true valid username, false invalid username
	 */
	public boolean validate(final String username)
	{

		matcher = pattern.matcher(username);
		return matcher.matches();

	}

}
