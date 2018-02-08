import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo2
{

	public static void main(String[] args)
	{

		ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
		System.out.println(zonedDateTime1);
		
		ZoneId zoneId = ZoneId.of("Z");
		System.out.println(zoneId);

		/*
		 * Parameters:
		 * 
		 * zone - the time-zone to change to, not null
		 * 
		 * Returns:
		 * 
		 * a ZonedDateTime based on this date-time with the
		 * requested zone, not null
		 * 
		 * If the zone ID equals 'Z', the result is ZoneOffset.UTC.
		 */
		ZonedDateTime zonedDateTime2 = zonedDateTime1
				.withZoneSameLocal(zoneId);
		
		System.out.println(zonedDateTime2);

	}

}
