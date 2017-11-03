import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthDemo2
{
	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.now();

		/*
		 * Returns:the month-of-year, from 1 to 12
		 */
		int monthValue = yearMonth.getMonthValue();
		System.out.println("monthValue = " + monthValue);

		/*
		 * Returns:the year, from MIN_YEAR to MAX_YEAR
		 */
		int year = yearMonth.getYear();
		System.out.println("year = " + year);

		/*
		 * Returns:the month-of-year, not null
		 */
		Month month = yearMonth.getMonth();
		System.out.println("month = " + month);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		year = yearMonth.get(ChronoField.YEAR);
		System.out.println("year = " + year);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		monthValue = yearMonth.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthValue = " + monthValue);

	}

}
