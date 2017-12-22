import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo2
{
	public static void main(String[] args)
	{
		GregorianCalendar cal1 = (GregorianCalendar) GregorianCalendar
				.getInstance();

		GregorianCalendar cal2 = (GregorianCalendar) (Calendar) cal1.clone();
		System.out.println(cal2.getTime());

		/*
		 * Parameters:
		 * 
		 * obj - the object to compare with.
		 * 
		 * Returns:true if this object is equal to obj; false
		 * otherwise.
		 */
		// compare the two calendars
		System.out.println("Cal1 and Cal2 are equal = " + cal1.equals(cal2));

		cal2.add(GregorianCalendar.YEAR, 10);

		System.out.println("Cal1 and Cal2 are equal = " + cal1.equals(cal2));

	}
}
