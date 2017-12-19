import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo2
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();
		System.out.println(cal.getTime());
		/*
		 * Returns: the Gregorian cutover date for this
		 * GregorianCalendar object.
		 */
		Date date = cal.getGregorianChange();
		System.out.println(date);

	}
}
