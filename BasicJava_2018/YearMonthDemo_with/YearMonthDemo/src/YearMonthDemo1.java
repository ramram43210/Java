import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.of(2014, 11);
		System.out.println("yearMonth1 = " + yearMonth1);

		/*
		 * Parameters:
		 * 
		 * month - the month-of-year to set in the returned
		 * year-month, from 1 (January) to 12 (December)
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the requested
		 * month, not null
		 */
		YearMonth yearMonth2 = yearMonth1.withMonth(3);
		System.out.println("yearMonth2 = " + yearMonth2);

		/*
		 * Parameters:
		 * 
		 * year - the year to set in the returned year-month, from
		 * MIN_YEAR to MAX_YEAR
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the requested
		 * year, not null
		 */
		YearMonth yearMonth3 = yearMonth2.withYear(2017);
		System.out.println("yearMonth3 = " + yearMonth3);

	}

}
