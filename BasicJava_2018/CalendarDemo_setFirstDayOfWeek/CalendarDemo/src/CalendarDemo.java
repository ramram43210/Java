import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		int day = cal.getFirstDayOfWeek();
		System.out.println("Current first day of the week = " + day);

		/*
		 * Parameters:value - the given first day of the week.
		 */
		cal.setFirstDayOfWeek(Calendar.FRIDAY);

		day = cal.getFirstDayOfWeek();
		System.out.println("Altered first day of the week = " + day);
	}
}
