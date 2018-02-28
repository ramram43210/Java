import java.time.Month;
import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * year - the year to represent, from MIN_YEAR to MAX_YEAR
		 * 
		 * month - the month-of-year to represent, from 1 (January) to
		 * 12 (December)
		 * 
		 * Returns:
		 * 
		 * the year-month, not null
		 */
		YearMonth YearMonth1 = YearMonth.of(2017, 9);
		System.out.println(YearMonth1);

		/*
		 * Parameters:
		 * 
		 * year - the year to represent, from MIN_YEAR to MAX_YEAR
		 * 
		 * month - the month-of-year to represent, not null
		 * 
		 * Returns:
		 * 
		 * the year-month, not null
		 */
		YearMonth YearMonth2 = YearMonth.of(2017, Month.JANUARY);
		System.out.println(YearMonth2);
	}

}
