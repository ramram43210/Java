import java.time.Clock;

public class ClockDemo
{

	public static void main(String[] args)
	{
		Clock clock = Clock.systemDefaultZone();
		System.out.println("clock = " + clock);

		/*
		 * Returns:
		 *
		 * the current millisecond instant from this clock, measured
		 * from the Java epoch of 1970-01-01T00:00Z (UTC), not null
		 */
		long millis = clock.millis();
		System.out.println("Clock millis = " + millis);
	}

}
