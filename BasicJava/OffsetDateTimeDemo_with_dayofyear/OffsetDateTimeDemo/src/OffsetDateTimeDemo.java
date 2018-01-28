import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{
		OffsetDateTime offsetDateTime1 = OffsetDateTime
				.parse("2017-02-03T10:15:30+01:00");
		System.out.println("offsetDateTime1       = " + offsetDateTime1);
		/*
		 * Parameters:
		 * 
		 * dayOfYear - the day-of-year to set in the result, from 1 to
		 * 365-366
		 * 
		 * Returns:an OffsetDateTime based on this date with the
		 * requested day, not null
		 */
		OffsetDateTime offsetDateTime2 = offsetDateTime1.withDayOfYear(150);
		System.out.println("DayOfYear changed     = " + offsetDateTime2);

		/*
		 * Parameters:
		 * 
		 * offset - the zone offset to change to, not null
		 * 
		 * Returns:an OffsetDateTime based on this date-time with the
		 * requested offset, not null
		 */
		OffsetDateTime offsetDateTime3 = offsetDateTime2
				.withOffsetSameInstant(ZoneOffset.UTC);
		System.out.println("Offset changed        = " + offsetDateTime3);
	}

}
