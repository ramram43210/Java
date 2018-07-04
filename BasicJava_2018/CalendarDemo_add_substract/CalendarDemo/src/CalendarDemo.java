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
		
		// subtract 3 months from the calendar
		cal.add(Calendar.MONTH, -3);
		System.out.println("3 months ago        = " + cal.getTime());

		// subtract 10 years from the calendar
		cal.add(Calendar.YEAR, -10);
		System.out.println("10 years ago        = " + cal.getTime());
	}
}
