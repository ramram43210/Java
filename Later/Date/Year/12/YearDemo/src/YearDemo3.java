import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class YearDemo3
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);

		/*
		 * Parameters:
		 * 
		 * month - the month-of-year to use, not null
		 * 
		 * Returns:
		 * 
		 * the year-month formed from this year and the specified
		 * month, not null
		 */

		YearMonth yearMonth = year.atMonth(Month.JANUARY);
		System.out.println(yearMonth);

	}

}
