import java.util.Calendar;

public class CalendarDemo
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
		 * the maximum of the given calendar field for the time value
		 * of this Calendar
		 */

		// get the maximum value that year field can have
		int maxYear = cal.getActualMaximum(Calendar.YEAR);
		System.out.println("Maximum year = " + maxYear);

		// get the maximum value that month field can have
		int maxMonth = cal.getActualMaximum(Calendar.MONTH);
		System.out.println("Maximum month = " + maxMonth);

	}

}
