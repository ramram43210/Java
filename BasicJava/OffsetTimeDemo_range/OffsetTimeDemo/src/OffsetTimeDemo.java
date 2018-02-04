import java.time.OffsetTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		OffsetTime offsetTime = OffsetTime.now();
		System.out.println("offsetTime = " + offsetTime);

		/*
		 * Gets the range of valid values for the specified field. 
		 * 
		 * Parameters:
		 *
		 * field - the field to query the range for, not null
		 *
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ValueRange valueRange = offsetTime.range(ChronoField.CLOCK_HOUR_OF_DAY);

		System.out.println("Range = " + valueRange);
		System.out.println("Max   = " + valueRange.getMaximum());
		System.out.println("min   = " + valueRange.getMinimum());
	}

}
