import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * startInclusive - the start instant, inclusive, not null
		 * 
		 * endExclusive - the end instant, exclusive, not null
		 * 
		 * Returns: a Duration, not null
		 * 
		 */
		Duration duration = Duration.between(LocalTime.MIDNIGHT,
				LocalTime.NOON);
		System.out.println("duration = " + duration);

		/*
		 * Returns:the whole seconds part of the length of the
		 * duration, positive or negative
		 */
		System.out.println("seconds = " + duration.getSeconds());

		/*
		 * Returns a copy of this duration with a positive length.
		 */
		System.out.println("abs = " + duration.abs());

	}

}
