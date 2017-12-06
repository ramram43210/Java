import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		boolean result = cal.isSet(Calendar.DAY_OF_MONTH);
		System.out.println("Day of month is set = " + result);

		// clear day of month
		cal.clear(Calendar.DAY_OF_MONTH);

		/*
		 * Parameters:
		 * 
		 * field - the calendar field to test
		 * 
		 * Returns:
		 * 
		 * true if the given calendar field has a value set; false
		 * otherwise.
		 */
		result = cal.isSet(Calendar.DAY_OF_MONTH);
		System.out.println("Day of month is set = " + result);
	}

}
