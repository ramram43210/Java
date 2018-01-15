import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 *
		 * year - the year to represent, from MIN_YEAR to MAX_YEAR
		 *
		 * month - the month-of-year to represent, not null
		 *
		 * dayOfMonth - the day-of-month to represent, from 1 to 31
		 *
		 * hour - the hour-of-day to represent, from 0 to 23
		 *
		 * minute - the minute-of-hour to represent, from 0 to 59
		 *
		 * Returns:
		 * 
		 * the local date-time, not null
		 */

		LocalDateTime localDateTime = LocalDateTime.of(2020, Month.MARCH, 30, 6,
				30);
		System.out.println(localDateTime);

	}

}
