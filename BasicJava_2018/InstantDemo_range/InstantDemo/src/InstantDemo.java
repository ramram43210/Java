import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class InstantDemo
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ValueRange range = instant.range(ChronoField.NANO_OF_SECOND);
		System.out.println("range =  "+range);
		System.out.println("min = " + range.getMinimum());
		System.out.println("max = " + range.getMaximum());

	}

}
