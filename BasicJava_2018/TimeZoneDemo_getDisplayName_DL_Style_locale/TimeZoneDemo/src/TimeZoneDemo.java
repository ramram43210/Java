import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone timezonedefault = TimeZone.getDefault();

		/*
		 * Parameters:
		 * 
		 * daylight - true specifying a Daylight Saving Time name, or
		 * false specifying a Standard Time
		 * 
		 * namestyle - either LONG or SHORTReturns:the human-readable
		 * name of this time zone in the default locale.
		 * 
		 * locale - the locale in which to supply the display name.
		 * 
		 * Returns:
		 * 
		 * the human-readable name of this time zone in the given
		 * locale.
		 */
		String displayName = timezonedefault.getDisplayName(true, TimeZone.LONG,
				new Locale("EN", "US"));
		System.out.println("displayName = " + displayName);

		displayName = timezonedefault.getDisplayName(true, TimeZone.SHORT,
				new Locale("EN", "US"));
		System.out.println("displayName = " + displayName);
	}
}
