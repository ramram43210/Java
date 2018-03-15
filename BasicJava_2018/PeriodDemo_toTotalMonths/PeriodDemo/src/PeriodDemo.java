import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period = Period.ofMonths(11);
		System.out.println("period = " + period);
		/*
		 * Returns:
		 * 
		 * the total number of months in the period, may be negative
		 */
		long totalMonths = period.toTotalMonths();
		System.out.println("totalMonths = " + totalMonths);

	}

}
