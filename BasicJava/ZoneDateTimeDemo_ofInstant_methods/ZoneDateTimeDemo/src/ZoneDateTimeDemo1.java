import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1
{

	public static void main(String[] args)
	{
		Instant instant = Instant.now();
		System.out.println(instant);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		/*
		 * 
		 * Obtains an instance of ZonedDateTime from an Instant. 
		 * 
		 * Parameters:
		 * 
		 * instant - the instant to create the date-time from, not
		 * null
		 * 
		 * zone - the time-zone, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
		System.out.println(zonedDateTime);

	}

}
