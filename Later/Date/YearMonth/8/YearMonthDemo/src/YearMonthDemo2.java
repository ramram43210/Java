import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class YearMonthDemo2
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

		ValueRange valueRange = yearMonth.range(ChronoField.YEAR);
		System.out.println(valueRange);
		System.out.println("Min = " + valueRange.getMinimum());
		System.out.println("Max = " + valueRange.getMaximum());
	}

}
