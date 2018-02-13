import java.time.Clock;
import java.time.Duration;

public class ClockDemo
{

	public static void main(String[] args)
	{
		Clock baseClock = Clock.systemUTC();
		System.out.println("instant of baseClock = " + baseClock.instant());

		Duration tickDuration = Duration.ofDays(300);
		System.out.println("tickDuration = " + tickDuration);

		/*
		 * Parameters:
		 * 
		 * baseClock - the base clock to base the ticking clock on,
		 * not null
		 * 
		 * tickDuration - the duration of each visible tick, not
		 * negative, not null
		 * 
		 * Returns:
		 * 
		 * a clock that ticks in whole units of the duration,
		 * not null
		 */

		Clock clock = Clock.tick(baseClock, tickDuration);

		System.out.println("instant of clock     = " + clock.instant());
	}

}
