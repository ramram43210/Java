import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo1
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
		 * offset - the zone offset, not null
		 *
		 * Returns:
		 *
		 * the offset date-time, not null
		 */
		OffsetDateTime offsetDateTime1 = OffsetDateTime.of(2017, 2, 28, 6, 50,
				40, 50000, ZoneOffset.UTC);
		System.out.println(offsetDateTime1);

	}

}
