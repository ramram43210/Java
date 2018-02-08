import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		Clock clock = Clock.systemUTC();
		System.out.println(clock);

		/*
		 * Obtains the current date-time from the specified clock.
		 * 
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:
		 * 
		 * the current date-time, not null
		 */
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now(clock);
		System.out.println(zonedDateTime1);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		/*
		 * Obtains the current date-time from the system clock in the
		 * specified time-zone.
		 * 
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:
		 * 
		 * the current date-time using the system clock, not null
		 * 
		 */
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId);
		System.out.println(zonedDateTime2);
	}

}
