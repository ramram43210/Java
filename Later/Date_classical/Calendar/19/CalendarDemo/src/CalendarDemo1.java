import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = new GregorianCalendar(2013, 05, 20);

		System.out.println("cal        = " + cal.getTime());

		/*
		 * Returns:a copy of this object.
		 */
		Calendar cal2 = (Calendar) cal.clone();

		System.out.println("Cloned cal = " + cal2.getTime());

	}
}
