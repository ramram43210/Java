import java.time.Month;
import java.time.temporal.ChronoField;

public class MonthDemo2
{
	public static void main(String[] args)
	{
		Month month = Month.MARCH;

		/*
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
