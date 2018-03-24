import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT,
				LocalTime.NOON);
		System.out.println("duration        = " + duration);

		/*
		 * Returns:a Duration based on this duration with the amount
		 * negated, not null
		 */
		Duration negatedDuration = duration.negated();
		System.out.println("negatedDuration = " + negatedDuration);
	}

}
