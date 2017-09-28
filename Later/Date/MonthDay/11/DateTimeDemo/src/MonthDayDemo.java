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

		System.out.println("After month Change = " + monthDay);
	}

}
