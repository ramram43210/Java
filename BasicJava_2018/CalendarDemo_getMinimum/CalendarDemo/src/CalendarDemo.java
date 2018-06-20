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
		 * the minimum value for the given calendar field.
		 */
		// return the minimum value for days
		int min = cal.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum days = " + min);

		// return the minimum value for months
		min = cal.getMinimum(Calendar.MONTH);
		System.out.println("Minimum months = " + min);

	}

}
