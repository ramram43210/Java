import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT,
				LocalTime.NOON);
		System.out.println("Before withNanos = " + duration.getNano());

		/*
		 * Parameters:
		 * 
		 * nanoOfSecond - the nano-of-second to represent, from 0 to
		 * 999,999,999
		 * 
		 * Returns:
		 * 
		 * a Duration based on this period with the requested
		 * nano-of-second, not null
		 */
		duration = duration.withNanos(10000);
		System.out.println("After withNanos = " + duration.getNano());

		System.out.println("Before withSeconds = " + duration.getSeconds());

		/*
		 * Parameters:
		 * 
		 * seconds - the seconds to represent, may be negative
		 * 
		 * Returns:
		 * 
		 * a Duration based on this period with the requested seconds,
		 * not null
		 */
		duration = duration.withSeconds(3000);
		System.out.println("After withSeconds = " + duration.getSeconds());

	}

}
