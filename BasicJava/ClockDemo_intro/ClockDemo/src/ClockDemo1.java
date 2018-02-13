import java.time.Clock;
import java.time.ZoneId;

public class ClockDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * a clock that uses the best available system clock in the
		 * default zone, not null
		 */
		Clock clock = Clock.systemDefaultZone();
		System.out.println("clock = "+clock);

		/*
		 * Returns:
		 * 
		 * the time-zone being used to interpret instants, not null
		 */
		ZoneId zoneId = clock.getZone();
		System.out.println("zoneId = "+zoneId);
	}

}
