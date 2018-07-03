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
		 * obj - the object to compare with.
		 * 
		 * Returns:
		 * 
		 * true if this object is equal to obj; false otherwise.
		 */

		boolean isEqual = cal1.equals(cal2);
		System.out.println("is cal1 equals  cal2 = " + isEqual);

	}
}
