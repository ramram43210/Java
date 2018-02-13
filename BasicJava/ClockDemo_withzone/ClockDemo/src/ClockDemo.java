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
		 * zone - the time-zone to change to, not null
		 * 
		 * Returns:
		 * 
		 * a clock based on this clock with the specified time-zone,
		 * not null
		 */
		Clock clock2 = clock1.withZone(ZoneId.systemDefault());
		System.out.println("clock2 = " + clock2.instant());
	}

}
