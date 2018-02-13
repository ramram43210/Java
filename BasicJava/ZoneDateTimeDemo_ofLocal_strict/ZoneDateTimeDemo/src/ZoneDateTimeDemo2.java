import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo2
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		ZoneId zoneId = ZoneId.of("Z");
		System.out.println(zoneId);

		ZoneOffset zoneOffSet = ZoneOffset.UTC;
		System.out.println(zoneOffSet);

		/*
		 * Parameters:
		 * 
		 * localDateTime - the local date-time, not null
		 * 
		 * offset - the zone offset, not null
		 * 
		 * zone - the time-zone, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 * 
		 */

		ZonedDateTime zonedDateTime = ZonedDateTime.ofStrict(localDateTime,
				zoneOffSet, zoneId);
		System.out.println(zonedDateTime);
	}

}
