import java.util.GregorianCalendar;
import java.util.Locale;

public class GregorianCalendarDemo1
{
	public static void main(String[] args)
	{
		Locale locale = Locale.getDefault();
		/*
		 * Parameters:
		 * 
		 * aLocale - the given locale.
		 */
		GregorianCalendar cal = new GregorianCalendar(locale);
		System.out.println(cal.getTime());
	}
}
