import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.of(2014, 11);
		System.out.println("yearMonth1 = " + yearMonth1);

		YearMonth yearMonth2 = YearMonth.of(2000, Month.JANUARY);
		System.out.println("yearMonth2 = " + yearMonth2);

		/*
		 * Parameters:
		 * 
		 * endExclusive - the end date, exclusive, which is converted
		 * to a YearMonth, not null
		 * 
		 * unit - the unit to measure the amount in, not null
		 * 
		 * Returns:
		 * 
		 * the amount of time between this year-month and the end
		 * year-month
		 */
		long yearDifference = yearMonth1.until(yearMonth2, ChronoUnit.YEARS);
		System.out.println("yearDifference = " + yearDifference);

		long monthDifference = yearMonth1.until(yearMonth2, ChronoUnit.MONTHS);
		System.out.println("monthDifference = " + monthDifference);
	}

}
