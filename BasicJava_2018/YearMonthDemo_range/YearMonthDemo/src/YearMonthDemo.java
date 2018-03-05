import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.now();

		/*
		 * Parameters:
		 *
		 * field - the field to query the range for, not null
		 *
		 * Returns:
		 *
		 * the range of valid values for the field, not null
		 */

		ValueRange yearRange = yearMonth.range(ChronoField.YEAR);
		System.out.println(yearRange);
		System.out.println("Min = " + yearRange.getMinimum());
		System.out.println("Max = " + yearRange.getMaximum());
		
		ValueRange monthRange = yearMonth.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(monthRange);
		System.out.println("Min = " + monthRange.getMinimum());
		System.out.println("Max = " + monthRange.getMaximum());

	}

}
