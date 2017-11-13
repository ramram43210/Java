import java.time.Period;

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
		boolean isZero = period.isZero();
		System.out.println(isZero);
	}

}
