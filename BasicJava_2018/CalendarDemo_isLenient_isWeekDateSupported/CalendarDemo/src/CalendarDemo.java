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
		System.out.println("isLenient = " + isLenient);

		/*
		 * Returns:true if this Calendar supports week dates; false
		 * otherwise.
		 */
		boolean isWeekDaySupported = cal.isWeekDateSupported();
		System.out
				.print("isWeekDaySupported = " + isWeekDaySupported);
	}
}
