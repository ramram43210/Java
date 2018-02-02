import java.time.OffsetTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		OffsetTime offsetTime1 = OffsetTime.now();
		System.out.println("offsetTime1           = " + offsetTime1);

		/*
		 * Parameters:
		 * 
		 * hour - the hour-of-day to set in the result, from 0 to 23
		 * 
		 * Returns:an OffsetTime based on this time with the requested
		 * hour, not null
		 */
		OffsetTime offsetTime2 = offsetTime1.withHour(1);
		System.out.println("Hour changed          = " + offsetTime2);

		/*
		 * Parameters:
		 * 
		 * minute - the minute-of-hour to set in the result, from 0 to
		 * 59
		 * 
		 * Returns:an OffsetTime based on this time with the requested
		 * minute, not null
		 */
		OffsetTime offsetTime3 = offsetTime2.withMinute(10);
		System.out.println("Min changed           = " + offsetTime3);

		/*
		 * Parameters:
		 * 
		 * second - the second-of-minute to set in the result, from 0
		 * to 59
		 * 
		 * Returns:an OffsetTime based on this time with the requested
		 * second, not null
		 */
		OffsetTime offsetTime4 = offsetTime3.withSecond(20);
		System.out.println("Sec changed           = " + offsetTime4);

		/*
		 * Parameters:
		 * 
		 * nanoOfSecond - the nano-of-second to set in the result,
		 * from 0 to 999,999,999
		 * 
		 * Returns:an OffsetTime based on this time with the requested
		 * nanosecond, not null
		 */
		OffsetTime offsetTime5 = offsetTime4.withNano(50);
		System.out.println("NanoSec changed       = " + offsetTime5);

	}

}
