import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		ZoneOffset zoneOffSet = ZoneOffset.UTC;
		System.out.println(zoneOffSet);

		/*
		 * Parameters:
		 * 
		 * localDateTime - the local date-time, not null
		 * 
		 * zone - the time-zone, not null
		 * 
		 * preferredOffset - the zone offset, null if no preference
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.ofLocal(localDateTime,
				zoneId, zoneOffSet);
		System.out.println(zonedDateTime);

	}

}
