import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffsetDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 *
		 * temporal - the temporal object to convert, not null
		 *
		 * Returns:
		 *
		 * the zone-offset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.from(ZonedDateTime.now());
		System.out.println(zoneOffset);
	}

}
