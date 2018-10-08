import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println(cal.getTime());

		/*
		 * Parameters:
		 * 
		 * weekYear - the week year
		 * 
		 * weekOfYear - the week number based on weekYear
		 * 
		 * dayOfWeek - the day of week value: one of the constants for
		 * the DAY_OF_WEEK field: SUNDAY, ..., SATURDAY.
		 */
		cal.setWeekDate(2030, 11, 2);

		System.out.println(cal.getTime());
	}
}
