import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{
		OffsetTime offsetTime1 = OffsetTime.now();
		System.out.println("offsetTime1   = " + offsetTime1);

		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount of the unit to subtract from
		 * the result, may be negative
		 * 
		 * unit - the unit of the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * an OffsetTime based on this time with the specified amount
		 * subtracted, not null
		 */
		OffsetTime offsetTime2 = offsetTime1.minus(2, ChronoUnit.HOURS);
		System.out.println("offsetTime2   = " + offsetTime2);
		
		
		OffsetTime offsetTime3 = offsetTime2.minus(20, ChronoUnit.MINUTES);
		System.out.println("offsetTime3   = " + offsetTime3);
	}

}
