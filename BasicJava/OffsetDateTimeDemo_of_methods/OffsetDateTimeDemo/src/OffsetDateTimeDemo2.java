import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo2
{

	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.parse("2017-02-03");
		LocalTime localTime = LocalTime.parse("12:30:30");
		ZoneOffset zoneOffset = ZoneOffset.UTC;

		/*
		 * Parameters:
		 * 
		 * date - the local date, not null.
		 * 
		 * time - the local time, not null
		 * 
		 * offset - the zone offset, not null.
		 * 
		 * Returns:
		 * 
		 * the offset date-time, not null
		 */

		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDate, localTime,
				zoneOffset);
		System.out.println(offsetDateTime);

	}

}
