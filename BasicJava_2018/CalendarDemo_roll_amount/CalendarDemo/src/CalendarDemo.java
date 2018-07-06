import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 8, 24);
		System.out.println("Month is " + cal.get(Calendar.MONTH));

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * amount - the signed amount to add to the calendar field.
		 */
		cal.roll(Calendar.MONTH, 2);

		System.out.println(
				"After rolling 2, Month is " + cal.get(Calendar.MONTH));

		cal.roll(Calendar.MONTH, -4);

		System.out.println(
				"After rolling -4, Month is " + cal.get(Calendar.MONTH));
	}
}
