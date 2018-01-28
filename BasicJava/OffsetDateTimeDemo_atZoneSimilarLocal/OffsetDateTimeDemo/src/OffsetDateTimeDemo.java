import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		OffsetDateTime offsetDateTime = OffsetDateTime
				.parse("2017-02-03T12:30:30+01:00");
		System.out.println(offsetDateTime);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		/*
		 * Parameters:
		 * 
		 * zone - the time-zone to use, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time formed from this date and the earliest
		 * valid time for the zone, not null
		 */
		ZonedDateTime zonedDateTime = offsetDateTime.atZoneSimilarLocal(zoneId);
		System.out.println(zonedDateTime);

	}

}
