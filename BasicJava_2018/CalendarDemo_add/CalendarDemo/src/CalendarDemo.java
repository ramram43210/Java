import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("The current date is = " + cal.getTime());

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * amount - the amount of date or time to be added to the field.
		 */
		
		// add 20 days to the calendar
		cal.add(Calendar.DATE, 20);
		System.out.println("20 days later       = " + cal.getTime());

		// add 3 months to the calendar
		cal.add(Calendar.MONTH, 3);
		System.out.println("3 months later      = " + cal.getTime());

		// add 10 years to the calendar
		cal.add(Calendar.YEAR, 10);
		System.out.println("10 years later      = " + cal.getTime());
	}
}
