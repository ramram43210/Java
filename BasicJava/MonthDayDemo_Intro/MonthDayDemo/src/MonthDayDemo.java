import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{

		/*
		 * Returns:
		 * 
		 * the current month-day using the system clock and
		 * default time-zone, not null
		 */
		MonthDay currentMonthDay = MonthDay.now();
		System.out.println(currentMonthDay);

		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "--12-03", not null
		 * 
		 * Returns:
		 * 
		 * the parsed month-day, not null
		 */

		MonthDay monthDay = MonthDay.parse("--03-30");
		System.out.println(monthDay);
	}

}
