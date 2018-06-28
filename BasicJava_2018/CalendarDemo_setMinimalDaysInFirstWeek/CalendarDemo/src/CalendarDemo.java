import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns: the minimal days required in the first week of the
		 * year.
		 */
		int min = cal.getMinimalDaysInFirstWeek();
		System.out.println("Before set, Minimal Days in Week = " + min);

		/*
		 * Parameters:
		 * 
		 * value - the given minimal days required in the first week
		 * of the year.
		 */
		cal.setMinimalDaysInFirstWeek(4);

		min = cal.getMinimalDaysInFirstWeek();
		System.out.println("After set, Minimal Days in Week  = " + min);
	}
}
