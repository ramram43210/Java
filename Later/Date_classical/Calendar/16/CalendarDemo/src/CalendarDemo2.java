import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
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
		cal.setWeekDate(2013, 11, 4);
		System.out.println(cal.getTime());
	}

}
