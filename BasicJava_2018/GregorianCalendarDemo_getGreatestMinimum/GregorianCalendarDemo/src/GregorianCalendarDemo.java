import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * Returns:
		 * 
		 * the highest minimum value for the given calendar field.
		 */
		int min = cal.getGreatestMinimum(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Greatest Minimum, DAY_OF_MONTH = " + min);

		min = cal.getGreatestMinimum(GregorianCalendar.MONTH);
		System.out.println("Greatest Minimum, MONTH = " + min);

		/*
		 * Parameters:
		 * 
		 * field - the calendar field
		 * 
		 * Returns:
		 * 
		 * the lowest maximum value for the given calendar field.
		 */
		int max = cal.getLeastMaximum(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Least Maximum, DAY_OF_MONTH = " + max);

		max = cal.getLeastMaximum(GregorianCalendar.MONTH);
		System.out.println("Least Maximum, MONTH = " + max);

	}
}
