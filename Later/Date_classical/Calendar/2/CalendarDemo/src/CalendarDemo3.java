import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarDemo3
{
	public static void main(String[] args)
	{
		Locale locale = Locale.US;
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone.getDisplayName());
		
		/*
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
		Calendar cal = Calendar.getInstance(timeZone,locale);

		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
