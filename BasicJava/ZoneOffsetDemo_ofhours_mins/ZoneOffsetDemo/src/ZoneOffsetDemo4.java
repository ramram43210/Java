import java.time.ZoneOffset;

public class ZoneOffsetDemo4
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * totalSeconds - the total time-zone offset in seconds, from
		 * -64800 to +64800
		 * 
		 * Returns:
		 * 
		 * the zone-offset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.ofTotalSeconds(7200);
		System.out.println("zoneOffset = " + zoneOffset);

	}

}
