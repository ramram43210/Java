import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal1 = Calendar.getInstance();
		System.out.println("Current date = " + cal1.getTime());

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2030);
		System.out.println("future date  = " + cal2.getTime());

		/*
		 * Parameters:
		 * 
		 * anotherCalendar - the Calendar to be compared.
		 * 
		 * Returns:
		 * 
		 * the value 0 if the time represented by the argument is
		 * equal to the time represented by this Calendar; a value
		 * less than 0 if the time of this Calendar is before the time
		 * represented by the argument; and a value greater than 0 if
		 * the time of this Calendar is after the time represented by
		 * the argument.
		 */

		int result = cal1.compareTo(cal2);
		System.out.println("result = " + result);

	}
}
