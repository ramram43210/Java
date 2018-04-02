import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo2
{
	public static void main(String[] args)
	{
		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println("instant = " + instant);
		/*
		 * Combines this instant with a time-zone to create a
		 * ZonedDateTime. 
		 * 
		 * Parameters:
		 * 
		 * zone - the zone to combine with, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time formed from this instant and the
		 * specified zone, not null
		 */
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
		System.out.println("zonedDateTime = " + zonedDateTime);
	}

}
