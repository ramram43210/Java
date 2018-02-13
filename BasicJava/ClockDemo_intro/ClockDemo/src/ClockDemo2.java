import java.time.Clock;
import java.time.Instant;

public class ClockDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * a clock that uses the best available system clock in the
		 * UTC zone, not null
		 */
		Clock clock = Clock.systemUTC();
		System.out.println("clock = "+clock);
		/*
		 * Returns:
		 * 
		 * the current instant from this clock, not null
		 */
		Instant instant = clock.instant();		
		System.out.println("instant = "+instant);
	}

}
