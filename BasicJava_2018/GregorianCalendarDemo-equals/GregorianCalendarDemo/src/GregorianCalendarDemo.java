import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal1 = (GregorianCalendar) GregorianCalendar
				.getInstance();
		System.out.println("cal1 = "+cal1.getTime());

		GregorianCalendar cal2 = (GregorianCalendar) cal1.clone();
		System.out.println("cal2 = "+cal1.getTime());

		/*
		 * Parameters:
		 * 
		 * obj - the object to compare with.
		 * 
		 * Returns:true if this object is equal to obj; false
		 * otherwise.
		 */
		// compare the two calendars
		System.out.println("cal1 and cal2 are equal = " + cal1.equals(cal2));

	}
}
