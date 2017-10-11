import java.time.Instant;
import java.time.OffsetTime;
import java.time.ZoneId;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		/*
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

		OffsetTime offsetTime = OffsetTime.ofInstant(Instant.now(),ZoneId.systemDefault());
		System.out.println("offsetTime           = " + offsetTime);

	}

}
