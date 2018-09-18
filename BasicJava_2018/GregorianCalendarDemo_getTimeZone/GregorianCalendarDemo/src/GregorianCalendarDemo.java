import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		/*
		 * Returns:the time zone object associated with this calendar.
		 */
		TimeZone timeZone = cal.getTimeZone();
		System.out.println("Time Zone = " + timeZone.getDisplayName());

	}
}
