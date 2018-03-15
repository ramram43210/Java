import java.time.Duration;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * nanos - the number of nanoseconds, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
		Duration duration1 = Duration.ofNanos(2000000);
	    System.out.println("duration1 = "+duration1);
	    
		/*
		 * Parameters:
		 * 
		 * seconds - the number of seconds, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
	    Duration duration2 = Duration.ofSeconds(10);
	    System.out.println("duration2 = "+duration2);
	}

}
