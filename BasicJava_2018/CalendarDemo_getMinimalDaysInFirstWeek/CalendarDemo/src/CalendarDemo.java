import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the minimal days required in the first week of the
		 * year.
		 */
		int MinimalDaysInFirstWeek = cal.getMinimalDaysInFirstWeek();

		System.out.println("MinimalDaysInFirstWeek = " + MinimalDaysInFirstWeek);
	}
}
