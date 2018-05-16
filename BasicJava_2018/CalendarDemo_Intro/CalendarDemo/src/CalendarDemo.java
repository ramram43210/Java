import java.util.Calendar;
import java.util.Date;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		/*
		 * Gets a calendar using the default time zone and locale. The
		 * Calendar returned is based on the current time in the
		 * default time zone with the default FORMAT locale.
		 * 
		 */
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		/*
		 * Returns:a Date representing the time value.
		 */
		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
