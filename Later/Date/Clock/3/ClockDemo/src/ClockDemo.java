import java.time.Clock;
import java.time.Duration;

public class ClockDemo
{

	public static void main(String[] args)
	{
		Clock baseClock = Clock.systemUTC();
		System.out.println("baseClock = " + baseClock.instant());

		Duration duration = Duration.ofHours(6);

		/*
		 * Parameters:
		 * 
		 * baseClock - the base clock to add the duration to, not null
		 * offsetDuration - the duration to add, not null
		 * 
		 * Returns:
		 * 
		 * a clock based on the base clock with the duration added,
		 * not null
		 */

		Clock clock = Clock.offset(baseClock, duration);
		System.out.println("clock     = " + clock.instant());
	}

}
