import java.time.Duration;

public class DurationDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * millis - the number of milliseconds, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
		Duration duration1 = Duration.ofMillis(1000);
	    System.out.println("duration1 = "+duration1);
	    
		/*
		 * Parameters:
		 * 
		 * minutes - the number of minutes, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
	    Duration duration2 = Duration.ofMinutes(20);
	    System.out.println("duration2 = "+duration2);
	}

}
