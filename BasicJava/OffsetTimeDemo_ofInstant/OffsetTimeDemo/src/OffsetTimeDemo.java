import java.time.Instant;
import java.time.OffsetTime;
import java.time.ZoneId;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		Instant instant = Instant.now();
		System.out.println("instant = " + instant);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("zondId = "+zoneId);

		/*
		 * Obtains an instance of OffsetTime from an Instant and zone ID.
		 * 
		 * Parameters:
		 * 
		 * instant - the instant to create the time from, not null
		 * 
		 * zone - the time-zone, which may be an offset, not null
		 * 
		 * Returns:
		 * 
		 * the offset time, not null
		 */

		OffsetTime offsetTime = OffsetTime.ofInstant(instant, zoneId);
		System.out.println("offsetTime  = " + offsetTime);

	}

}
