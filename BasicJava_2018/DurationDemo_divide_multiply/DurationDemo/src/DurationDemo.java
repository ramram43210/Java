import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT,
				LocalTime.NOON);

		System.out.println("Before dividedBy = " + duration);

		/*
		 * Parameters:
		 *
		 * divisor - the value to divide the duration by, positive or
		 * negative, not zero
		 *
		 * Returns:
		 *
		 * a Duration based on this duration divided by the specified
		 * divisor, not null
		 */
		duration = duration.dividedBy(2);

		System.out.println("After dividedBy 2 = " + duration);

		duration = duration.multipliedBy(3);

		System.out.println("After multipliedBy 3 = " + duration);

	}

}
