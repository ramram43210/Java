import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println(
				"Current Time Zone = " + cal.getTimeZone().getDisplayName());

		/*
		 * Parameters:zone - the given time zone.
		 */
		cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out
				.println("New Time Zone     = " + cal.getTimeZone().getDisplayName());
	}
}
