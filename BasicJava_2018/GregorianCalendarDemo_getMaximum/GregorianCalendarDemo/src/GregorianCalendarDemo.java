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
		 * the maximum value for the given calendar field.
		 */
		int max = cal.getMaximum(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Maximum, DAY_OF_MONTH = " + max);
		
		max = cal.getMaximum(GregorianCalendar.MONTH);
		System.out.println("Maximum, MONTH = " + max);

		max = cal.getMaximum(GregorianCalendar.YEAR);
		System.out.println("Maximum, YEAR = " + max);

	}
}
