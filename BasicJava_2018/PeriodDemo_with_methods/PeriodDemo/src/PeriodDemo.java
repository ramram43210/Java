import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period1 = Period.ofMonths(12);
		System.out.println("period1 = " + period1);

		/*
		 * Parameters:
		 * 
		 * days - the days to represent, may be negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the requested days, not
		 * null
		 */

		Period period2 = period1.withDays(20);
		System.out.println("period2[withDays] = " + period2);

		/*
		 * Parameters:
		 * 
		 * years - the years to represent, may be negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the requested years, not
		 * null
		 */
		Period period3 = period2.withYears(2017);
		System.out.println("period3[withYears] = " + period3);
		
		/*
		 * Parameters:
		 * 
		 * months - the months to represent, may be negative
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the requested months,
		 * not null
		 */
		Period period4 = period3.withMonths(1);
		System.out.println("period4[withMonths]= " + period4);

	}

}
