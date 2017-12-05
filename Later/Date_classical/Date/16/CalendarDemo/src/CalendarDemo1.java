import java.util.Calendar;
import java.util.TimeZone;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.getTimeZone().getDisplayName());

		TimeZone timeZone = TimeZone.getTimeZone("GMT");

		/*
		 * Parameters:
		 * 
		 * value - the given time zone.
		 */
		cal.setTimeZone(timeZone);

		System.out.println(cal.getTimeZone().getDisplayName());
	}
}
