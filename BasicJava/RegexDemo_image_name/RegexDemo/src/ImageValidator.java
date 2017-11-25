import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * How to validate image file extension with regular expression
 *
 */
public class ImageValidator
{

	private Pattern pattern;
	private Matcher matcher;

	private static final String IMAGE_NAME_REGEX = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";

	public ImageValidator()
	{
		pattern = Pattern.compile(IMAGE_NAME_REGEX);
	}

	/**
	 * Validate image with regular expression
	 * 
	 * @param imageName imageName for validation
	 * @return true valid imageName, false invalid imageName
	 */
	public boolean validate(final String imageName)
	{
		matcher = pattern.matcher(imageName);
		return matcher.matches();
	}
}
