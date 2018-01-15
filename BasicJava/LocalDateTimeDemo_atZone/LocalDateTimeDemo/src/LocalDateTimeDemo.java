import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime
				.parse("2017-05-03T12:30:30");

		System.out.println(localDateTime);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("zoneId = "+zoneId);

		/*
		 * Parameters:
		 * 
		 * zone - the time-zone to use, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time formed from this date-time, not null
		 */
		ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

		System.out.println(zonedDateTime);

	}

}
