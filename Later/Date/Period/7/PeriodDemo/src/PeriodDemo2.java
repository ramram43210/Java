import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo2
{
	public static void main(String[] args)
	{
		Period period = Period.ofMonths(12);

		/*
		 * Parameters:
		 * 
		 * unit - the TemporalUnit for which to return the value
		 * 
		 * Returns:
		 * 
		 * the long value of the unit
		 */
		long monthValue = period.get(ChronoUnit.MONTHS);

		System.out.println(monthValue);
	}

}
