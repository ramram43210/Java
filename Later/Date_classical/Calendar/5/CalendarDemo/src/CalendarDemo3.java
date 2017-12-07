import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarDemo3
{
	public static void main(String[] args)
	{
		 Calendar cal = Calendar.getInstance();

		/*
		 * Parameters:
		 * 
		 * field - the calendar field
		 * 
		 * Returns:
		 * 
		 * the minimum of the given calendar field for the time value
		 * of this Calendar
		 */

		// get the minimum value that year field can have
		int maxYear = cal.getActualMinimum(Calendar.YEAR);
		System.out.println("Maximum year = " + maxYear);

		// get the minimum value that month field can have
		int maxMonth = cal.getActualMinimum(Calendar.MONTH);
		System.out.println("Maximum month = " + maxMonth);

	}

}
