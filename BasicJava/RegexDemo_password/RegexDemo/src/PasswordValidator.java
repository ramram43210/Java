import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * How to validate password with regular expression
 *
 */
public class PasswordValidator
{
	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_REGEX = 
			          "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

	public PasswordValidator()
	{
		pattern = Pattern.compile(PASSWORD_REGEX);
	}

	/**
	 * Validate password with regular expression
	 * 
	 * @param password  password for validation
	 * @return true valid password, false invalid password
	 */
	public boolean validate(final String password)
	{
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
