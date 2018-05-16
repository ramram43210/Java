import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * public static Calendar getInstance(TimeZone zone)
 * 
 * Gets a calendar using the specified time zone and default locale.
 * The Calendar returned is based on the current time in the given
 * time zone with the default FORMAT locale.
 * 
 * Parameters:
 * 
 * zone - the time zone to use
 * 
 * Returns: 
 * 
 * a Calendar.
 * 
 */
public class CalendarDemo2
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone.getDisplayName());

		Calendar cal = Calendar.getInstance(timeZone);

		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
