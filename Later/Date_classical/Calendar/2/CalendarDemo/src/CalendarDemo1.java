import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * aLocale - the locale for the week data
		 * 
		 * Returns:
		 * 
		 * a Calendar.
		 */
		Calendar cal = Calendar.getInstance(Locale.FRENCH);

		Date date = cal.getTime();
		System.out.print("Date and Time is = " + date);

	}

}
