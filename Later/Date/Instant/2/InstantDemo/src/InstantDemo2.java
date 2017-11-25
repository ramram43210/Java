import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantDemo2
{
	public static void main(String[] args)
	{

		Instant instant = Instant.now();

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns: 
		 * 
		 * the value for the field
		 */
		long secondValue = instant.getLong(ChronoField.NANO_OF_SECOND);
		System.out.println("secondValue = "+secondValue);
		
	}

}
