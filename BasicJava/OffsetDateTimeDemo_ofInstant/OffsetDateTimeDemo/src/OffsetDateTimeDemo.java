import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{
		Instant instant = Instant.now();
		ZoneId zoneId = ZoneId.systemDefault();

		/*
		 * Parameters:
		 *
		 * instant - the instant to create the date-time from, not
		 * null
		 *
		 * zone - the time-zone, which may be an offset, not null
		 *
		 * Returns:
		 *
		 * the offset date-time, not null
		 */
		OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant,
				zoneId);
		System.out.println(offsetDateTime);
	}

}
