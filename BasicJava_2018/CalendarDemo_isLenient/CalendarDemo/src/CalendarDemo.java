import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:true if the interpretation mode of this calendar is
		 * lenient; false otherwise.
		 */
		boolean isLenient = cal.isLenient();
		System.out.println("Calendar is lenient   = " + isLenient);

		/*
		 * Parameters:
		 * 
		 * lenient - true if the lenient mode is to be turned on;
		 * false if it is to be turned off.
		 */
		cal.setLenient(false);

		isLenient = cal.isLenient();
		System.out.println("Lenient after setting = " + isLenient);
	}
}
