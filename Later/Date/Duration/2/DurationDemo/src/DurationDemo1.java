import java.time.Duration;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * days - the number of days, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
		Duration duration1 = Duration.ofDays(10);
	    System.out.println("duration1 = "+duration1);
	    
		/*
		 * Parameters:
		 * 
		 * hours - the number of hours, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Duration, not null
		 */
	    Duration duration2 = Duration.ofHours(10);
	    System.out.println("duration2 = "+duration2);
	}

}
