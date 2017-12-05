import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the week year of this Calendar
		 */
		int weekYear = cal.getWeekYear();
		System.out.println("weekYear = " + weekYear);
	}

}
