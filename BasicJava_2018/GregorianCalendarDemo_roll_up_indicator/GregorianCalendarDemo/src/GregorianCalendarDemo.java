import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println("Date = "+cal.getTime());

		/*
		 * Parameters:
		 * 
		 * field - the time field.
		 * 
		 * up - indicates if the value of the specified calendar field
		 * is to be rolled up or rolled down. Use true if rolling up,
		 * false otherwise.
		 */
		// roll a month forward
		cal.roll(GregorianCalendar.MONTH, true); 
		System.out.println("Date = " + cal.getTime());

		// roll a year backwards
		cal.roll(GregorianCalendar.YEAR, false);
		System.out.println("Date = " + cal.getTime());
	}
}
