import java.time.Period;
import java.time.temporal.TemporalAmount;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		TemporalAmount temporalAmount = Period.ofMonths(12);

		/*
		 * Obtains an instance of Period from a temporal amount.
		 * 
		 * Parameters:
		 * 
		 * amount - the temporal amount to convert, not null
		 * 
		 * Returns:
		 * 
		 * the equivalent period, not null
		 */
		Period period = Period.from(temporalAmount);

		System.out.println(period);

	}

}
