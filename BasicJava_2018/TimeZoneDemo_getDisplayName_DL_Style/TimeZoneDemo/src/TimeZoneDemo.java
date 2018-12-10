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
		 * Returns:
		 * 
		 * the human-readable name of this time zone in the default
		 * locale.
		 */
		String displayName = timezonedefault.getDisplayName(true,
				TimeZone.LONG);
		System.out.println("displayName LONG  = " + displayName);

		displayName = timezonedefault.getDisplayName(true, TimeZone.SHORT);
		System.out.println("displayName SHORT = " + displayName);
	}
}
