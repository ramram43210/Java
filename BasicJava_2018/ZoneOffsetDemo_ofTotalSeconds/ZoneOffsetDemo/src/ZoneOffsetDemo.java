import java.time.ZoneOffset;

public class ZoneOffsetDemo
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
		 * the ZoneOffset, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.ofTotalSeconds(3600);
		System.out.println(zoneOffset);
	}

}
