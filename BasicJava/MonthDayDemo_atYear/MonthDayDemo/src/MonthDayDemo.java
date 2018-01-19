import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay monthDay = MonthDay.now();
		System.out.println(monthDay);

		/*
		 * Parameters:
		 * 
		 * year - the year to use, from MIN_YEAR to MAX_YEAR
		 * 
		 * Returns:
		 * 
		 * the local date formed from this month-day and the
		 * specified year, not null
		 */
		LocalDate localDate = monthDay.atYear(2013);
		System.out.println(localDate);
	}
}
