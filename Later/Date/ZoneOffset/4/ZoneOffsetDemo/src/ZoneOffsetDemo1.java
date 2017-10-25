import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class ZoneOffsetDemo1
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.UTC;

		/*
		 * Parameters:
		 * 
		 * field - the field to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the field is supported on this offset, false if not
		 */
		boolean result = zoneOffset.isSupported(ChronoField.OFFSET_SECONDS);
		System.out.println(result);
	}

}
