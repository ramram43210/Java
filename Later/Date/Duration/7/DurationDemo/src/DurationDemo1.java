import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
		
		/*
		 * Returns:the number of days in the duration, may be negative
		 */
		System.out.println("toDays    = " + duration.toDays());
		
		/*
		 * Returns:the number of hours in the duration, may be negative
		 */
		System.out.println("toHours   = " + duration.toHours());
		
		/*
		 * Returns:the number of minutes in the duration, may be negative
		 */
		System.out.println("toMinutes = " + duration.toMinutes());
		
		/*
		 * Returns:the total length of the duration in milliseconds
		 */
		System.out.println("toMillis  = " + duration.toMillis());
		
		/*
		 * Returns:the total length of the duration in nanoseconds
		 */
		System.out.println("toNanos   = " + duration.toNanos());

	}

}
