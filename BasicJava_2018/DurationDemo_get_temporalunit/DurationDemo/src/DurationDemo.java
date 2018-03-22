import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT,
				LocalTime.NOON);
		System.out.println("duration = " + duration);

		/*
		 * Gets the value of the requested unit. 
		 * 
		 * Parameters:
		 * 
		 * unit - the TemporalUnit for which to return the value
		 * 
		 * Returns: 
		 * 
		 * the long value of the unit
		 * 
		 */
		long secondsValue = duration.get(ChronoUnit.SECONDS);
		System.out.println("secondsValue = " + secondsValue);

		long nanosValue = duration.get(ChronoUnit.NANOS);
		System.out.println("nanosValue = " + nanosValue);
	}

}
