import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{
	public static void main(String[] args)
	{

		Duration duration = Duration.between(LocalTime.NOON,
				LocalTime.MIDNIGHT);
		System.out.println("duration = "+duration);
		/*
		 * Returns:true if this duration has a total length less than
		 * zero
		 */
		System.out.println("is duration Negative? = "+duration.isNegative());

		/*
		 * Returns:true if this duration has a total length equal to
		 * zero
		 */
		System.out.println("is duration zero? = "+duration.isZero());
	}

}
