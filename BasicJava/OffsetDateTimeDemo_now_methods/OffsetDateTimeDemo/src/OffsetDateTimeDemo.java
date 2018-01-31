import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		Clock clock = Clock.systemUTC();
		System.out.println(clock);
		
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:the current date-time, not null
		 */
		OffsetDateTime offsetDateTime1 = OffsetDateTime.now(clock);
		System.out.println(offsetDateTime1);
		
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		
		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:the current date-time using the system clock, not
		 * null
		 */
		OffsetDateTime offsetDateTime2 = OffsetDateTime.now(zoneId);
	    System.out.println(offsetDateTime2); 

	}

}
