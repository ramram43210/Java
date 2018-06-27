import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the week year of this Calendar
		 */
		int weekYear = cal.getWeekYear();
		System.out.println("weekYear = " + weekYear);
		
		/*
		 * Returns:the number of weeks in the week year.
		 */
		long numberOfWeeks = cal.getWeeksInWeekYear();
		System.out.println("numberOfWeeks = " + numberOfWeeks);
	}

}
