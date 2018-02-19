import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.of("+01:00");
		System.out.println("zoneOffset = " + zoneOffset);
		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		int offsetSeconds = zoneOffset.get(ChronoField.OFFSET_SECONDS);

		System.out.println("offsetSeconds = " + offsetSeconds);
	}

}
