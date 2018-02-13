import java.time.Clock;
import java.time.ZoneId;

public class ClockDemo
{

	public static void main(String[] args)
	{
		Clock clock1 = Clock.systemDefaultZone();
		System.out.println("clock1 = " + clock1.instant());

		/*
		 * Parameters:
		 * 
		 * zone - the time-zone to use to convert the instant to
		 * date-time, not null
		 * 
		 * Returns:
		 * 
		 * a clock that ticks in whole seconds using the specified
		 * zone, not null
		 */
		Clock clock2 = Clock.tickSeconds(ZoneId.systemDefault());
		System.out.println("clock2 = " + clock2.instant());
	}

}
