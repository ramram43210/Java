import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;

public class YearDemo1
{

	public static void main(String[] args)
	{

		Year year = Year.of(2017);
		/*
		 * Parameters:
		 * 
		 * dayOfYear - the day-of-year to use, from 1 to 365-366
		 * 
		 * Returns:
		 * 
		 * the local date formed from this year and the specified date
		 * of year, not null
		 */
		LocalDate localDate = year.atDay(300);
		System.out.println(localDate);

		/*
		 * Parameters:
		 * 
		 * month - the month-of-year to use, from 1 (January) to 12
		 * (December)
		 * 
		 * Returns:
		 * 
		 * the year-month formed from this year and the specified
		 * month, not null
		 */
		YearMonth yearMonth = year.atMonth(2);
		System.out.println(yearMonth);

	}

}
