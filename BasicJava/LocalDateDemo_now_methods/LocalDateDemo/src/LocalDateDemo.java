import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateDemo
{
	public static void main(String[] args)
	{
		/*
		 * Returns:the current date using the system clock and default
		 * time-zone, not null
		 */
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);

		Clock clock = Clock.systemUTC();
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:the current date, not null
		 */

		LocalDate date2 = LocalDate.now(clock);
		System.out.println(date2);

		ZoneId zoneId = ZoneId.systemDefault();
		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:the current date using the system clock, not null
		 */
		LocalDate date3 = LocalDate.now(zoneId);
		System.out.println(date3);
	}

}
