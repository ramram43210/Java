import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{
		ZoneOffset zoneOffset = ZoneOffset.UTC;

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */

		ValueRange range = zoneOffset.range(ChronoField.OFFSET_SECONDS);
		System.out.println("range = "+range);
		System.out.println("Max = " + range.getMaximum());
		System.out.println("Min = " + range.getMinimum());
	}

}
