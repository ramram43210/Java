import java.time.ZoneOffset;

public class ZoneOffsetDemo2
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * hours - the time-zone offset in hours, from -18 to +18
		 * 
		 * minutes - the time-zone offset in minutes, from 0 to ±59,
		 * sign matches hours
		 * 
		 * Returns:
		 * 
		 * the zone-offset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.ofHoursMinutes(5, 30);
		System.out.println("zoneOffset = " + zoneOffset);

	}

}
