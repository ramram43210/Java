import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.now();

		/*
		 * Parameters:
		 * 
		 * field - the field to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the field is supported on this year-month, false if
		 * not
		 */
		boolean isYearSupported = yearMonth.isSupported(ChronoField.YEAR);
		System.out.println("isYearSupported = " + isYearSupported);

		boolean isMonthYearSupported = yearMonth
				.isSupported(ChronoField.MONTH_OF_YEAR);
		System.out.println("isMonthYearSupported = " + isMonthYearSupported);

		boolean isDayOfMonthSupported = yearMonth
				.isSupported(ChronoField.DAY_OF_MONTH);
		System.out.println("isDayOfMonthSupported = " + isDayOfMonthSupported);

	}

}
