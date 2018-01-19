import java.time.Month;
import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current month-day using the system clock and
		 * default time-zone, not null
		 */
		MonthDay monthDay = MonthDay.now();
		System.out.println("monthDay = " + monthDay);

		/*
		 * Returns:the day-of-month, from 1 to 31
		 */
		int dayOfTheMonth = monthDay.getDayOfMonth();
		System.out.println("dayOfTheMonth = " + dayOfTheMonth);

		/*
		 * Returns:the month-of-year, from 1 to 12
		 */
		int monthValue = monthDay.getMonthValue();
		System.out.println("monthValue = " + monthValue);

		/*
		 * Returns:the month-of-year, not null
		 */
		Month month = monthDay.getMonth();
		System.out.println("month = " + month);
		System.out.println("month value = " + month.getValue());

	}

}
