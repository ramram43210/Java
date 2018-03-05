import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthDemo3
{
	public static void main(String[] args)
	{
		YearMonth yearMonth1 = YearMonth.of(2020, 11);
		System.out.println("yearMonth1 = " + yearMonth1);

		/*
		 * Parameters:
		 * 
		 * field - the field to set in the result, not null
		 * 
		 * newValue - the new value of the field in the result
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this with the specified field set, not
		 * null
		 */
		YearMonth yearMonth2 = yearMonth1.with(ChronoField.YEAR,2013);
		System.out.println("yearMonth2 = " + yearMonth2);
	}

}
