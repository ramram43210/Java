import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * hour - the hour-of-day to represent, from 0 to 23
		 * 
		 * minute - the minute-of-hour to represent, from 0 to 59
		 * 
		 * second - the second-of-minute to represent, from 0 to 59
		 * 
		 * nanoOfSecond - the nano-of-second to represent, from 0 to
		 * 999,999,999
		 * 
		 * offset - the zone offset, not null
		 * 
		 * Returns:
		 * 
		 * the offset time, not null
		 */

		OffsetTime offsetTime1 = OffsetTime.of(6, 30, 40, 50000,
				ZoneOffset.UTC);
		System.out.println("offsetTime1  = " + offsetTime1);

		LocalTime localTime = LocalTime.now();
		/*
		 * Parameters:
		 * 
		 * time - the local time, not null
		 * 
		 * offset - the zone offset, not null
		 * 
		 * Returns:
		 * 
		 * the offset time, not null
		 */
		OffsetTime offsetTime2 = OffsetTime.of(localTime, ZoneOffset.UTC);
		System.out.println("offsetTime2  = " + offsetTime2);
	}

}
