import java.time.Period;

public class PeriodDemo2
{
	public static void main(String[] args)
	{
		Period periodOfYears = Period.ofYears(2017);
		System.out.println("Before Plus, periodOfYears = " + periodOfYears);
		
		/*
		 * Parameters:
		 * 
		 * yearsToAdd - the years to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the specified years
		 * added, not null
		 */
		periodOfYears = periodOfYears.plusYears(13);
		System.out.println("After Plus, periodOfYears = " + periodOfYears);
		
		
		Period periodOfMonth = Period.ofMonths(2);
		System.out.println("Before Plus, periodOfMonth = " + periodOfMonth);
		
		/*
		 * Parameters:
		 * 
		 * amountToAdd - the amount to add, not null
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the requested period
		 * added, not null
		 */
		periodOfMonth = periodOfMonth.plus(Period.ofMonths(10));
		System.out.println("After Plus, periodOfMonth = " + periodOfMonth);
	}

}
