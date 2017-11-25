import java.time.Instant;

public class InstantDemo1
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println("Before minus         = "+instant);
		
		/*
		 * Parameters:
		 * 
		 * secondsToAdd - the seconds to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * an Instant based on this instant with the specified seconds
		 * added, not null
		 */
		instant = instant.minusSeconds(10000);
		System.out.println("After  minusSeconds  = "+instant);
		
		/*
		 * Parameters:
		 * 
		 * millisToAdd - the milliseconds to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * an Instant based on this instant with the specified
		 * milliseconds added, not null
		 */
		instant = instant.minusMillis(20000);
		System.out.println("After  minusMillis   = "+instant);
		
		/*
		 * Parameters:
		 * 
		 * nanosToAdd - the nanoseconds to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * an Instant based on this instant with the specified
		 * nanoseconds added, not null
		 */
		instant = instant.minusNanos(50000);
		System.out.println("After  minusNanos    = "+instant);

	}

}
