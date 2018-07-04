import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		System.out.println("Before clear = " + cal.getTime());

		/*
		 * Parameters:
		 *
		 * field - the calendar field to be cleared.
		 */
		cal.clear(Calendar.YEAR);

		System.out.println("After clear  = " + cal.getTime());
	}
}
