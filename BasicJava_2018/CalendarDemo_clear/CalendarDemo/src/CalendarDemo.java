import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		System.out.println("Before clear = " + cal.getTime());

		/*
		 * use clear method to set all field values and time value as
		 * undefined.
		 */
		cal.clear();

		System.out.println("After clear  = " + cal.getTime());
	}
}
