import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * public int getActualMinimum(int field)
		 *
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
		int minYear = cal.getActualMinimum(Calendar.YEAR);
		System.out.println("Minimum year = " + minYear);

		// get the minimum value that month field can have
		int minMonth = cal.getActualMinimum(Calendar.MONTH);
		System.out.println("Minimum month = " + minMonth);

	}

}
