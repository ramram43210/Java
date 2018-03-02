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
		 * yearsToSubtract - the years to subtract, may be negative
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the years
		 * subtracted, not null
		 */
		YearMonth yearMonth2 = yearMonth1.minusYears(5);
		System.out.println("yearMonth2 = " + yearMonth2);

		/*
		 * Parameters:
		 * 
		 * monthsToSubtract - the months to subtract, may be negative
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the months
		 * subtracted, not null
		 */
		YearMonth yearMonth3 = yearMonth2.minusMonths(2);
		System.out.println("yearMonth3 = " + yearMonth3);
	}

}
