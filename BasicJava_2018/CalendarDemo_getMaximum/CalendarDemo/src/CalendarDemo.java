import java.util.Calendar;

public class CalendarDemo
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
		 * the maximum value for the given calendar field.
		 */
		// return the maximum value for days
		int max = cal.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum days = " + max);

		// return the maximum value for months
		max = cal.getMaximum(Calendar.MONTH);
		System.out.println("Maximum months = " + max);
	}
}
