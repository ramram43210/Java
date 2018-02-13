import java.time.Clock;
import java.time.ZoneId;

public class ClockDemo3
{

	public static void main(String[] args)
	{

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("zoneId = " + zoneId);

		/*
		 * Parameters:
		 * 
		 * zone - the time-zone to use to convert the instant to
		 * date-time, not null
		 * 
		 * Returns:
		 * 
		 * a clock that uses the best available system clock in the
		 * specified zone, not null
		 */
		Clock clock = Clock.system(zoneId);
		System.out.println("Clock = " + clock);
	}

}
