import java.time.Month;
import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.now();
		System.out.println("yearMonth = " + yearMonth);

		/*
		 * Returns:
		 * 
		 * the month-of-year, from 1 to 12
		 */
		int monthValue = yearMonth.getMonthValue();
		System.out.println("monthValue = " + monthValue);

		/*
		 * Returns:
		 * 
		 * the year, from MIN_YEAR to MAX_YEAR
		 */
		int year = yearMonth.getYear();
		System.out.println("year = " + year);

		/*
		 * Returns:
		 * 
		 * the month-of-year, not null
		 */
		Month month = yearMonth.getMonth();
		System.out.println("month = " + month);

	}

}
