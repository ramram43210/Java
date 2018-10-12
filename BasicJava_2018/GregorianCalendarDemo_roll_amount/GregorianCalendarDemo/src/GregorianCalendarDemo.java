import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println(cal.getTime());
		System.out.println("Date = " + cal.getTime());

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * amount - the signed amount to add to field.
		 */
		// roll 3 months forward
		cal.roll(GregorianCalendar.MONTH, 3);
		System.out.println("Date = " + cal.getTime());

		// roll 10 year backwards
		cal.roll(GregorianCalendar.YEAR, -10);
		System.out.println("Date = " + cal.getTime());
	}
}
