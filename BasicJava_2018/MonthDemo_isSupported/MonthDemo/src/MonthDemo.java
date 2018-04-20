import java.time.Month;
import java.time.temporal.ChronoField;

public class MonthDemo
{
	public static void main(String[] args)
	{

		Month month = Month.of(3);

		/*
		 * Parameters:
		 * 
		 * field - the field to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the field is supported on this month-of-year, false
		 * if not
		 */
		boolean isSupported = month.isSupported(ChronoField.MONTH_OF_YEAR);
		System.out.println(isSupported);
	}

}
