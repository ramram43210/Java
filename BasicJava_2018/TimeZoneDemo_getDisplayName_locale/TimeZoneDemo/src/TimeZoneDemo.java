import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();

		Locale locale = new Locale("EN", "US");

		/*
		 * Parameters:
		 * 
		 * locale - the locale in which to supply the display name.
		 * 
		 * Returns:
		 * 
		 * the human-readable name of this time zone in the given
		 * locale.
		 */
		String displayName = timeZone.getDisplayName(locale);

		System.out.println("displayName = " + displayName);
	}
}
