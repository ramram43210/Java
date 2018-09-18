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
		 * the minimum value for the given calendar field.
		 */
		int min = cal.getMinimum(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Minimum, DAY_OF_MONTH = " + min);

		min = cal.getMinimum(GregorianCalendar.MONTH);
		System.out.println("Minimum, MONTH = " + min);

		min = cal.getMinimum(GregorianCalendar.YEAR);
		System.out.println("Minimum, YEAR = " + min);

	}
}
