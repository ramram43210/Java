import java.util.Calendar;
import java.util.TimeZone;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the time zone object associated with this calendar.
		 */
		TimeZone timeZone = cal.getTimeZone();

		System.out.println("timeZone = " + timeZone.getDisplayName());
	}

}
