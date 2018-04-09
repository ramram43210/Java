import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantDemo
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println("instant = "+instant);
		
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println("zoneDateTime = "+zoneDateTime);

		/*
		 * Parameters:
		 * 
		 * endExclusive - the end date, exclusive, which is converted
		 * to an Instant, not null
		 * 
		 * unit - the unit to measure the amount in, not null
		 * 
		 * Returns:
		 * 
		 * the amount of time between this instant and the end instant
		 */

		long value = instant.until(zoneDateTime, ChronoUnit.DAYS);
		System.out.println(value);

	}

}
