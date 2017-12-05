import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		cal.set(2013,3,10);

		System.out.println("Before setting Time = " + cal.getTime());

		Date date = new Date();
		long ms = date.getTime();

		/*
		 * Parameters:
		 * 
		 * millis - the new time in UTC milliseconds from the epoch.
		 */
		cal.setTimeInMillis(ms);

		System.out.println("After setting Time = " + cal.getTime());
	}

}
