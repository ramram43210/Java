import java.time.Month;
import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay monthDay = MonthDay.parse("--12-15");

		System.out.println("Before month Change = " + monthDay);

		/*
		 * Parameters:
		 *
		 * month - the month-of-year to set in the returned month-day,
		 * not null
		 *
		 * Returns:a MonthDay based on this month-day with the
		 * requested month, not null
		 */
		monthDay = monthDay.with(Month.APRIL);

		System.out.println("After month Change1 = " + monthDay);

		/*
		 * Parameters:
		 * 
		 * month - the month-of-year to set in the returned month-day,
		 * from 1 (January) to 12 (December)
		 * 
		 * Returns: a MonthDay based on this month-day with the
		 * requested month, not null
		 * 
		 */
		monthDay = monthDay.withMonth(8);

		System.out.println("After month Change2 = " + monthDay);

		/*
		 * Parameters:
		 *
		 * dayOfMonth - the day-of-month to set in the return
		 * month-day, from 1 to 31
		 *
		 * Returns:a MonthDay based on this month-day with the
		 * requested day, not null
		 */

		monthDay = monthDay.withDayOfMonth(30);

		System.out.println("After day Change    = " + monthDay);
	}

}
