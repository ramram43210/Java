import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period = Period.ofMonths(12);
		System.out.println("period = "+period);
		
		/*
		 * Returns:
		 * 
		 * true if any unit of this period is negative
		 */
		boolean isNegative  = period.isNegative();
		System.out.println("isNegative = "+isNegative);
		
		
		/*
		 * Checks if all three units of this period are zero.
		 * 
		 * A zero period has the value zero for the years, months and
		 * days units
		 * 
		 */
		boolean isZero = period.isZero();
		System.out.println("isZero = "+isZero);

	}

}
