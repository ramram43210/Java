import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println(cal.getTime());

		/*
		 * Returns:the number of weeks in the week year.
		 */
		int weeksInWeekYear = cal.getWeeksInWeekYear();
		System.out.println("weeksInWeekYear = " + weeksInWeekYear);

	}
}
