import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);

		 System.out.println("Before dividedBy = "+duration.getSeconds());

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

	    System.out.println("After dividedBy = "+duration.getSeconds());

	    duration = duration.multipliedBy(2);

		    System.out.println(duration.getSeconds());


	}

}
