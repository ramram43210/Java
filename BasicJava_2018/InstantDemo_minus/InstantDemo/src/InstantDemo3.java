import java.time.Duration;
import java.time.Instant;

public class InstantDemo3
{
	public static void main(String[] args)
	{
		Instant instant = Instant.parse("2017-12-15T10:15:30.00Z");
		System.out.println("Before plus  = "+instant);
		
		Duration duration = Duration.ofDays(5);
		/*
		 * Parameters:
		 *
		 * amountToAdd - the amount to add, not null
		 *
		 * Returns:
		 *
		 * an Instant based on this instant with the addition made,
		 * not null
		 */
		instant = instant.minus(duration);
		System.out.println("After  minus = "+instant);
	}

}
