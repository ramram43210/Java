import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo2
{
	public static void main(String[] args)
	{
		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println("Before plus = "+instant);
		
		/*
		 * Parameters:
		 * 
		 * amountToAdd - the amount of the unit to add to the result,
		 * may be negative
		 * 
		 * unit - the unit of the amount to add, not null
		 * 
		 * Returns:
		 * 
		 * an Instant based on this instant with the specified amount
		 * added, not null
		 */
		instant = instant.plus(10,ChronoUnit.DAYS);
		System.out.println("After  plus = "+instant);
	}

}
