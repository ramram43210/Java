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
		 * field - the given calendar field.
		 * 
		 * Returns:
		 * 
		 * the value for the given calendar field.
		 */
		int year = cal.get(GregorianCalendar.YEAR);
		boolean isLeapYear = cal.isLeapYear(year);
		System.out.println(year + " is leap year = " + isLeapYear);

		isLeapYear = cal.isLeapYear(2020);
		System.out.println("2020 Is leap year = " + isLeapYear);
	}
}
