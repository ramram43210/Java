import java.time.Instant;

public class InstantDemo
{
	public static void main(String[] args)
	{

		/*
		 * Instant MAX defines the maximum supported Instant,
		 * '1000000000-12-31T23:59:59.999999999Z' is the value.
		 */
		Instant instant = Instant.MAX;
		System.out.println("Max = "+instant);
		System.out.println("Max EpochSecond = "+instant.getEpochSecond());
	    
		/*
		 * Instant MIN defines the minimum supported Instant,
		 * '-1000000000-01-01T00:00Z'.
		 */
		instant = Instant.MIN;
		System.out.println("Min = "+instant);
		System.out.println("Min EpochSecond = "+instant.getEpochSecond());
	    
		/*
		 * Instant EPOCH defines the constant for the
		 * 1970-01-01T00:00:00Z epoch instant.
		 */
	    instant = Instant.EPOCH;
	    System.out.println("EPOCH = "+instant);
		System.out.println("EPOCH EpochSecond = "+instant.getEpochSecond());
		
	}

}
