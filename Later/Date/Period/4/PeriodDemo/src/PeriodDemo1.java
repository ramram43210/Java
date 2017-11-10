import java.time.Period;

public class PeriodDemo1
{

	public static void main(String[] args)
	{

		Period periodOfDays = Period.ofDays(12);
		System.out.println("Before Minus, periodOfDays = " + periodOfDays);

		/*
		 * Parameters:
		 * 
		 * daysToSubtract - the months to subtract, positive or
		 * negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the specified days
		 * subtracted, not null
		 */
		periodOfDays = periodOfDays.minusDays(5);
		System.out.println("After Minus, periodOfDays = " + periodOfDays);
		
		
		Period periodOfMonth = Period.ofMonths(12);
		System.out.println("Before Minus, periodOfMonth = " + periodOfMonth);
		
		/*
		 * Parameters:
		 * 
		 * monthsToSubtract - the years to subtract, positive or
		 * negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the specified months
		 * subtracted, not null
		 */
		periodOfMonth = periodOfMonth.minusMonths(5);
		System.out.println("After Minus, periodOfMonth = " + periodOfMonth);
	}

}
