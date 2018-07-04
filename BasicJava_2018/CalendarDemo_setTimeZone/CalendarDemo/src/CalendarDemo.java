import java.util.Calendar;
import java.util.TimeZone;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		System.out.println(
				"Before setTimeZone = " + cal.getTimeZone().getDisplayName());

		TimeZone timeZone = TimeZone.getTimeZone("GMT");

		/*
		 * Parameters:
		 * 
		 * value - the given time zone.
		 */
		cal.setTimeZone(timeZone);

		System.out.println(
				"After setTimeZone  = " + cal.getTimeZone().getDisplayName());
	}
}
