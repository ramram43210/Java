import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2017,8,24);
		System.out.println("Month is " + cal.get(Calendar.MONTH));

		/*
		 * Parameters:
		 * 
		 * field - the time field.
		 * 
		 * up - indicates if the value of the specified time field is
		 * to be rolled up or rolled down. Use true if rolling up,
		 * false otherwise.
		 */
		cal.roll(Calendar.MONTH, true);

		System.out.println("After roll up, Month is " + cal.get(Calendar.MONTH));

		cal.roll(Calendar.MONTH, false);

		System.out.println("After roll down, Month is " + cal.get(Calendar.MONTH));
	}
}
