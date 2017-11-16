import java.time.Period;

public class PeriodDemo1
{

	public static void main(String[] args)
	{

		Period period = Period.ofMonths(12);
		/*
		 * Returns:
		 * 
		 * true if any unit of this period is negative
		 */
		boolean isNegative  = period.isNegative();
		System.out.println("isNegative = "+isNegative);

	}

}
