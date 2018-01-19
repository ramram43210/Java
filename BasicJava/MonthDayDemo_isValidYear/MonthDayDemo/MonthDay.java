import java.time.LocalDate;
import java.time.MonthDay;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current month-day using the system clock and
		 * default time-zone, not null
		 */
		MonthDay monthDay = MonthDay.now();

		/*
		 * Parameters:
		 * 
		 * year - the year to use, from MIN_YEAR to MAX_YEAR
		 * 
		 * Returns:the local date formed from this month-day and the
		 * specified year, not null
		 */
		LocalDate localDate = monthDay.atYear(2013);
		System.out.println(localDate);
	}

}
