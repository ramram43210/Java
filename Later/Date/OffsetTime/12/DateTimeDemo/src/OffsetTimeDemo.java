import java.time.Clock;
import java.time.OffsetTime;
import java.time.ZoneId;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{
		
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:the current time, not null
		 */
		
		OffsetTime offsetTime1 = OffsetTime.now(Clock.systemUTC());
		System.out.println("offsetTime1           = " + offsetTime1);

		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:the current time using the system clock, not null
		 */
		OffsetTime offsetTime2 = OffsetTime.now(ZoneId.systemDefault());
		System.out.println("offsetTime2           = " + offsetTime2);
	}

}
