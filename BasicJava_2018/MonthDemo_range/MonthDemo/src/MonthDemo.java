import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDemo
{
	public static void main(String[] args)
	{
		Month month = Month.of(2);

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ValueRange valueRange = month.range(ChronoField.MONTH_OF_YEAR);
		System.out.println("Range = " + valueRange);
		System.out.println("Min = " + valueRange.getMinimum());
		System.out.println("Max = " + valueRange.getMaximum());
	}

}
