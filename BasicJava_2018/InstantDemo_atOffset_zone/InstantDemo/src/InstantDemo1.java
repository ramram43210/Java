import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantDemo1
{
	public static void main(String[] args)
	{
		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println("instant = " + instant);
		/*
		 * Combines this instant with an offset to create an
		 * OffsetDateTime.
		 * 
		 * Parameters:
		 * 
		 * offset - the offset to combine with, not null
		 * 
		 * Returns:
		 * 
		 * the offset date-time formed from this instant and the
		 * specified offset, not null
		 */
		OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.UTC);
		System.out.println("offsetDateTime = " + offsetDateTime);
	}

}
