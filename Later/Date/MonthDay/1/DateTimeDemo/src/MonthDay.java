import java.time.MonthDay;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current month-day using the system clock and
		 * default time-zone, not null
		 */
		MonthDay monthDay1 = MonthDay.now();
		System.out.println(monthDay1);

		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "--12-03", not null
		 * 
		 * Returns:the parsed month-day, not null
		 */

		MonthDay monthDay2 = MonthDay.parse("--03-30");
		System.out.println(monthDay2);
	}

}
