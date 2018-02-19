import java.time.ZoneOffset;

public class ZoneOffsetDemo3
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
		 * seconds - the time-zone offset in seconds, from 0 to ±59,
		 * sign matches hours and minutes
		 * 
		 * Returns:
		 * 
		 * the zone-offset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.ofHoursMinutesSeconds(5,30,20);
		System.out.println("zoneOffset = " + zoneOffset);

	}

}
