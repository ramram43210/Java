import java.time.Month;
import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * month - the month-of-year to represent, from 1 (January) to
		 * 12 (December)
		 * 
		 * dayOfMonth - the day-of-month to represent, from 1 to
		 * 31Returns:the month-day, not null
		 */
		MonthDay monthDay1 = MonthDay.of(9, 30);
		System.out.println(monthDay1);

		/*
		 * 
		 * Parameters:
		 * 
		 * month - the month-of-year to represent, not null
		 * 
		 * dayOfMonth - the day-of-month to represent, from 1 to 31
		 * 
		 * Returns:the month-day, not null
		 */
		MonthDay monthDay2 = MonthDay.of(Month.JULY, 30);
		System.out.println(monthDay2);
	}

}
