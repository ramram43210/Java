import java.time.ZoneOffset;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * offsetId - the offset ID, not null
		 * 
		 * Returns:
		 * 
		 * the zone-offset, not null
		 * 
		 */
		ZoneOffset zoneOffset = ZoneOffset.of("+01:00");

		System.out.println("zoneOffset = " + zoneOffset);

	}

}
