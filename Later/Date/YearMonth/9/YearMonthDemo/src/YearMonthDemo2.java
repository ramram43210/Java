import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthDemo2
{
	public static void main(String[] args)
	{
		YearMonth yearMonth = YearMonth.now();

		/*
		 * Parameters:
		 *
		 * field - the field to get, not null
		 *
		 * Returns:
		 *
		 * the value for the field
		 */

		long year = yearMonth.getLong(ChronoField.YEAR);
		System.out.println("year = " + year);
		
		long monthOfYear = yearMonth.getLong(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYear = " + monthOfYear);
	}

}
