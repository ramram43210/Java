import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar gCal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		/*
		 * Parameters:
		 * 
		 * field - the calendar field
		 * 
		 * Returns:
		 * 
		 * the maximum of the given field for the time value of this
		 * GregorianCalendar
		 */
		int max = gCal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Actual Maximum, DAY_OF_MONTH = " + max);

		max = gCal.getActualMaximum(GregorianCalendar.MONTH);
		System.out.println("Actual Maximum, MONTH = " + max);

		/*
		 * Parameters:
		 * 
		 * field - the calendar field
		 * 
		 * Returns:
		 * 
		 * the minimum of the given field for the time value of this
		 * GregorianCalendar
		 */
		int min = gCal.getActualMinimum(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Actual Minimum, DAY_OF_MONTH = " + min);

		min = gCal.getActualMinimum(GregorianCalendar.MONTH);
		System.out.println("Actual Minimum, MONTH = " + min);

	}
}
