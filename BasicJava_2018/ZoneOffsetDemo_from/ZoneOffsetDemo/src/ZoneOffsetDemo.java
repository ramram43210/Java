import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime = "+zonedDateTime);
		
		/*
		 * Parameters:
		 *
		 * temporal - the temporal object to convert, not null
		 *
		 * Returns:
		 *
		 * the zone-offset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.from(zonedDateTime);
		System.out.println("zoneOffset = "+zoneOffset);
	}

}
