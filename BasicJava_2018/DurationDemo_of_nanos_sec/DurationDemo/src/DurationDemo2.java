import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * seconds - the number of seconds, positive or negative
		 * 
		 * nanoAdjustment - the nanosecond adjustment to the number of
		 * seconds, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
		Duration duration1 = Duration.ofSeconds(10, 909090);
		System.out.println("duration1 = " + duration1);

		/*
		 * Parameters:
		 * 
		 * amount - the amount of the duration, measured in terms of
		 * the unit, positive or negative
		 * 
		 * unit - the unit that the duration is measured in, must have
		 * an exact duration, not null
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
		Duration duration2 = Duration.of(10, ChronoUnit.DAYS);
		System.out.println("duration2 = " + duration2);
	}

}
