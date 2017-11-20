import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo2
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT,LocalTime.NOON);
		System.out.println(duration);
		/*
		 * Returns:true if this duration has a total length less than zero
		 */
		System.out.println(duration.isNegative());

		System.out.println();
		
		duration = Duration.between(LocalTime.NOON,LocalTime.MIDNIGHT);
		System.out.println(duration);
		System.out.println(duration.isNegative());
		
		/*
		 * Returns:true if this duration has a total length equal to zero
		 */
		System.out.println(duration.isZero());

	}

}
