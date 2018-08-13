import java.util.GregorianCalendar;
import java.util.Locale;

public class GregorianCalendarDemo1
{
	public static void main(String[] args)
	{
		Locale locale = Locale.getDefault();
		System.out.println("locale = "+locale);
		/*
		 * Parameters:
		 * 
		 * aLocale - the given locale.
		 */
		GregorianCalendar cal = new GregorianCalendar(locale);
		System.out.println(cal.getTime());
	}
}
