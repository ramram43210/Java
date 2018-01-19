import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay monthDay = MonthDay.parse("--12-30");
		System.out.println(monthDay);

		/*
		 * Parameters:
		 * 
		 * pattern - the pattern to use, not null
		 * 
		 * Returns:
		 * 
		 * the formatter based on the pattern, not null
		 * 
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("--MM");

		/*
		 * Parameters:
		 * 
		 * formatter - the formatter to use, not null
		 * 
		 * Returns:the formatted month-day string, not null
		 */

		String formatedValue = monthDay.format(formatter);
		System.out.println(formatedValue);
	}

}
