import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantDemo1
{
	public static void main(String[] args)
	{
		 Instant instant = Instant.parse("2014-12-03T10:15:30.00Z");
		 
		/*
		 * Parameters:
		 * 
		 * field - the field to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the field is supported on this instant, false if
		 * not
		 */
		 System.out.println(instant.isSupported(ChronoField.NANO_OF_SECOND));
		 System.out.println(instant.isSupported(ChronoField.DAY_OF_MONTH));
	}

}
