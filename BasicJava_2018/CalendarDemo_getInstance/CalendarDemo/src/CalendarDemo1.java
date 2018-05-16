import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * public static Calendar getInstance(Locale aLocale)
 * 
 * Gets a calendar using the default time zone and specified locale.
 * The Calendar returned is based on the current time in the default
 * time zone with the given locale.
 * 
 * Parameters:
 * 
 * aLocale - the locale for the week data
 * 
 * Returns:
 * 
 * a Calendar.
 */

public class CalendarDemo1
{
	public static void main(String[] args)
	{

		Calendar cal = Calendar.getInstance(Locale.FRENCH);

		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
