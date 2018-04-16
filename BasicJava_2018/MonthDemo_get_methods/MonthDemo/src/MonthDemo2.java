import java.time.Month;
import java.time.temporal.ChronoField;

public class MonthDemo2
{
	public static void main(String[] args)
	{
		Month month = Month.MARCH;
		System.out.println("month = " + month);

		/*
		 * Gets the value of the specified field from this
		 * month-of-year as a long.
		 * 
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field, within the valid range of values
		 */
		long monthOfYear = month.getLong(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYear = " + monthOfYear);
	}

}
