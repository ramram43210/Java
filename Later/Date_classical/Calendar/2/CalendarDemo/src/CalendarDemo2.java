import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone.getDisplayName());

		/*
		 * Parameters:
		 * 
		 * zone - the time zone to use
		 * 
		 * Returns:
		 * 
		 * a Calendar.
		 */
		Calendar cal = Calendar.getInstance(timeZone);

		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
