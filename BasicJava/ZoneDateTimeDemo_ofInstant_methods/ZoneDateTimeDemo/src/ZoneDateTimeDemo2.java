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

		ZoneOffset zoneOffset = ZoneOffset.UTC;
		System.out.println(zoneOffset);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

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

		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(localDateTime,
				zoneOffset, zoneId);
		System.out.println(zonedDateTime);
	}

}
