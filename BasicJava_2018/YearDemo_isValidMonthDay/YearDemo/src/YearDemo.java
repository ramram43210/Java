import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class YearDemo
{

	public static void main(String[] args)
	{

		Year year = Year.of(2017);

		/*
		 * Parameters:
		 * 
		 * monthDay - the month-day to validate, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the month and day are valid for this year
		 */
		boolean isValidMonthDay = year
				.isValidMonthDay(MonthDay.of(Month.FEBRUARY, 1));
		System.out.println("isValidMonthDay = " + isValidMonthDay);

		isValidMonthDay = year.isValidMonthDay(MonthDay.of(Month.FEBRUARY, 30));
		System.out.println("isValidMonthDay = " + isValidMonthDay);

	}

}
