import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * Returns:
		 * 
		 * the minimum value for the given calendar field.
		 */
		// return the minimum value for days
		int max = cal.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum days = " + max);

		// return the minimum value for months
		max = cal.getMinimum(Calendar.MONTH);
		System.out.println("Maximum months = " + max);

	}

}
