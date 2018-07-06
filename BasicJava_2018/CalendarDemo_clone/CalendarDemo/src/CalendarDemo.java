import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal1 = new GregorianCalendar(2013, 05, 20);

		System.out.println("cal1        = " + cal1.getTime());

		/*
		 * Returns:a copy of this object.
		 */
		Calendar cal2 = (Calendar) cal1.clone();

		System.out.println("Cloned cal2 = " + cal2.getTime());

	}
}
