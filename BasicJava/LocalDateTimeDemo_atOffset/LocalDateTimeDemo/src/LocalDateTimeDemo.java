import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime
				.parse("2017-02-03T12:30:30");
		System.out.println("localDateTime   = "+localDateTime);

		ZoneOffset zoneOffset = ZoneOffset.ofHours(5);
		System.out.println("zoneOffset      = "+zoneOffset);
		/*
		 * Parameters:
		 * 
		 * offset - the offset to combine with, not null
		 * 
		 * Returns:
		 * 
		 * the offset date-time formed from this date-time and the
		 * specified offset, not null
		 */
		OffsetDateTime offsetDateTime = localDateTime.atOffset(zoneOffset);
		System.out.println("offsetDateTime  = "+offsetDateTime);
	}

}
