import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * public static Calendar getInstance(TimeZone zone, Locale aLocale)
 * 
 * Gets a calendar with the specified time zone and locale. The
 * Calendar returned is based on the current time in the given time
 * zone with the given locale.
 * 
 * Parameters:
 * 
 * zone - the time zone to use
 * 
 * aLocale - the locale for the week data
 * 
 * Returns:
 * 
 * a Calendar.
 */

public class CalendarDemo3
{
	public static void main(String[] args)
	{
		Locale locale = Locale.US;
		System.out.println(locale);
		
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone.getDisplayName());

		Calendar cal = Calendar.getInstance(timeZone, locale);

		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
