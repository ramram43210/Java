import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class GregorianCalendarDemo3
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();
		Locale locale = Locale.getDefault();

		/*
		 * Parameters:
		 * 
		 * zone - the given time zone.
		 * aLocale - the given locale.
		 */
		GregorianCalendar cal = new GregorianCalendar(timeZone,locale);
		System.out.println(cal.getTime());
	}
}
