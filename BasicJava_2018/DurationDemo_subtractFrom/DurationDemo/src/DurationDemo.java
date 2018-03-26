import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class DurationDemo
{
	public static void main(String[] args)
	{
		Duration duration = Duration.ofDays(5);
		System.out.println("duration = "+duration);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime = "+localDateTime);

		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to adjust, not null
		 * 
		 * Returns:
		 * 
		 * an object of the same type with the adjustment made, not
		 * null
		 */
		Temporal temporal = duration.subtractFrom(localDateTime);
		System.out.println("temporal = "+temporal);

	}

}
