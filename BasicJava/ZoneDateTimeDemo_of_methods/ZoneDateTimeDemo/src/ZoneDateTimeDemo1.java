import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * year - the year to represent, from MIN_YEAR to MAX_YEAR
		 * 
		 * month - the month-of-year to represent, from 1 (January) to
		 * 12 (December)
		 * 
		 * dayOfMonth - the day-of-month to represent, from 1 to 31
		 * 
		 * hour - the hour-of-day to represent, from 0 to 23
		 * 
		 * minute - the minute-of-hour to represent, from 0 to 59
		 * 
		 * second - the second-of-minute to represent, from 0 to 59
		 * 
		 * nanoOfSecond - the nano-of-second to represent, from 0 to
		 * 999,999,999
		 * 
		 * zone - the time-zone, not null
		 * 
		 * Returns: the offset date-time, not null
		 * 
		 */

		ZonedDateTime zonedDateTime = ZonedDateTime.of(2018, 2, 3, 6, 30, 40,
				50000, ZoneId.systemDefault());
		System.out.println(zonedDateTime);

	}

}
