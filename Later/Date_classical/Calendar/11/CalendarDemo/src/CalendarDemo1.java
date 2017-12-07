import java.util.Calendar;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the number of weeks in the week year.
		 */
		long numberOfWeeks = cal.getWeeksInWeekYear();
		System.out.println("numberOfWeeks = " + numberOfWeeks);
	}
}
