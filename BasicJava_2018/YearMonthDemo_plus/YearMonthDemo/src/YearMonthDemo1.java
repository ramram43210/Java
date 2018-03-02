import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.now();

		System.out.println("yearMonth1 = " + yearMonth1);

		/*
		 * Parameters:
		 * 
		 * yearsToAdd - the years to add, may be negative
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the years
		 * added, not null
		 */
		YearMonth yearMonth2 = yearMonth1.plusYears(5);
		System.out.println("yearMonth2 = " + yearMonth2);
		
		/*
		 * Parameters:
		 * 
		 * monthsToAdd - the months to add, may be negative
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the
		 * months added, not null
		 */
		YearMonth yearMonth3 = yearMonth2.plusMonths(2);
		System.out.println("yearMonth3 = " + yearMonth3);
	}

}
