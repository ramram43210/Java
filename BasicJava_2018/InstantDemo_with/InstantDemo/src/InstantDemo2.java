import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantDemo2
{
	public static void main(String[] args)
	{
		  Instant instant1 = Instant.parse("2017-12-03T10:15:30.00Z");
		  System.out.println("instant1 = "+instant1);
		  
		/*
		 * Parameters:
		 * 
		 * field - the field to set in the result, not null 
		 * 
		 * newValue - the new value of the field in the result
		 * 
		 * Returns:
		 * 
		 * an Instant based on this with the specified field set, not
		 * null
		 */
		  Instant instant2 = instant1.with(ChronoField.NANO_OF_SECOND, 800);
		  System.out.println("instant2 = "+instant2);
	}

}
