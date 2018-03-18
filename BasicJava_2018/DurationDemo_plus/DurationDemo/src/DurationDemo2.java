import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationDemo2
{
	public static void main(String[] args)
	{
		Duration duration = Duration.ofDays(1);
		System.out.println("duration         = " + duration);

		/*
		 * Parameters:
		 * 
		 * amountToAdd - the amount to add, measured in terms of the
		 * unit, positive or negative
		 * 
		 * unit - the unit that the amount is measured in, must have
		 * an exact duration, not null
		 * 
		 * Returns:
		 * 
		 * a Duration based on this duration with the specified
		 * duration added, not null
		 */
		duration = duration.plus(1, ChronoUnit.DAYS);
		System.out.println("Plus 1 days      = " + duration);

		duration = duration.plus(20, ChronoUnit.MINUTES);
		System.out.println("Plus 20 minutes  = " + duration);

	}

}
