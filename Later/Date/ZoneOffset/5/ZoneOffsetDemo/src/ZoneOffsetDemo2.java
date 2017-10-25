import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ZoneOffsetDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ZoneOffset zoneOffset = ZoneOffset.UTC;
		ValueRange valueRange = zoneOffset.range(ChronoField.OFFSET_SECONDS);
		System.out.println(valueRange);
		System.out.println("Max = "+valueRange.getMaximum());
		System.out.println("Min = "+valueRange.getMaximum());
	}

}
