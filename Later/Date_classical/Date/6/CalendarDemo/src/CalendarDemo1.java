import java.util.Calendar;
import java.util.Locale;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		/*
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
