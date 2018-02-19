import java.time.ZoneOffset;

public class ZoneOffsetDemo1
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * hours - the time-zone offset in hours, from -18 to +18
		 * 
		 * Returns:
		 * 
		 * the zone-offset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.ofHours(4);
		System.out.println("zoneOffset = " + zoneOffset);	
		
	}

}
