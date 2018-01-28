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
		 * offset - the zone offset to change to, not null
		 * 
		 * Returns:
		 * 
		 * an OffsetDateTime based on this date-time with the
		 * requested offset, not null
		 */
		OffsetDateTime offsetDateTime2 = offsetDateTime1
				.withOffsetSameLocal(ZoneOffset.UTC);
		System.out.println("Offset changed        = " + offsetDateTime2);
	}

}
