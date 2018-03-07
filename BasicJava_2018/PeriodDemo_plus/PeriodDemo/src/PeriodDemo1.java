import java.time.Period;

public class PeriodDemo1
{

	public static void main(String[] args)
	{

		Period periodOfDays = Period.ofDays(12);
		System.out.println("Before Plus, periodOfDays = " + periodOfDays);

		/*
		 * Parameters:
		 * 
		 * daysToAdd - the days to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the specified days
		 * added, not null
		 */
		periodOfDays = periodOfDays.plusDays(15);
		System.out.println("After Plus, periodOfDays = " + periodOfDays);
		
		
		Period periodOfMonths = Period.ofMonths(2);
		System.out.println("Before Plus, periodOfMonths = " + periodOfMonths);
		
		/*
		 * Parameters:
		 * 
		 * monthsToAdd - the months to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the specified months added, not null
		 */
		periodOfMonths = periodOfMonths.plusMonths(5);
		System.out.println("After Plus, periodOfMonths = " + periodOfMonths);
	}

}
