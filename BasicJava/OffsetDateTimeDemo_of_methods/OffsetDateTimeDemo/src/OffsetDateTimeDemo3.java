import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo3
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime
				.parse("2017-02-03T12:20:30");
		ZoneOffset zoneOffset = ZoneOffset.UTC;

		/*
		 * Parameters:
		 * 
		 * dateTime - the local date-time, not null.
		 * 
		 * offset - the zone offset, not null
		 * 
		 * Returns:
		 * 
		 * the offset date-time, not null
		 */
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime,
				zoneOffset);
		System.out.println(offsetDateTime);
	}

}
