import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();
		
		System.out.println(cal.getTime());

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * amount - the amount of date or time to be added to the
		 * field.
		 */
		// add 2 months
		cal.add(GregorianCalendar.MONTH, 2);
		System.out.println(cal.getTime());

		// add 2 years
		cal.add(GregorianCalendar.YEAR, 2);
		System.out.println(cal.getTime());

	}
}
