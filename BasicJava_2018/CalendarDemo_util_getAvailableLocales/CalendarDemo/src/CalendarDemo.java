import java.util.Calendar;
import java.util.Locale;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		/*
		 * public static Locale[] getAvailableLocales()
		 * 
		 * Returns:An array of locales for which localized Calendar
		 * instances are available.
		 */
		Locale[] localeArray = Calendar.getAvailableLocales();

		for (Locale locale : localeArray)
		{
			System.out.println(locale);
		}
	}
}
