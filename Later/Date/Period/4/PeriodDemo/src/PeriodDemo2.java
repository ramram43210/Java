import java.time.Period;

public class PeriodDemo2
{
	public static void main(String[] args)
	{
		Period periodOfYears = Period.ofYears(2017);
		System.out.println("Before Minus, periodOfYears = " + periodOfYears);
		
		/*
		 * Parameters:
		 * 
		 * yearsToSubtract - the years to subtract, positive or
		 * negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the specified years
		 * subtracted, not null
		 */
		periodOfYears = periodOfYears.minusYears(13);
		System.out.println("After Minus, periodOfYears = " + periodOfYears);
		
		
		Period periodOfMonth = Period.ofMonths(12);
		System.out.println("Before Minus, periodOfMonth = " + periodOfMonth);
		
		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the requested period
		 * subtracted, not null
		 */
		periodOfMonth = periodOfMonth.minus(Period.ofMonths(10));
		System.out.println("After Minus, periodOfMonth = " + periodOfMonth);
	}

}
