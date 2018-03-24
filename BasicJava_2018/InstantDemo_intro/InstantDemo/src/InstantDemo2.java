import java.time.Clock;
import java.time.Instant;

public class InstantDemo2
{
	public static void main(String[] args)
	{

		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock);

		/*
		 * Obtains the current instant from the specified clock.
		 * 
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:
		 * 
		 * the current instant, not null
		 */
		Instant instant = Instant.now(clock);
		System.out.println(instant);

	}

}
