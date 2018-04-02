import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class InstantDemo
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println("instant = "+instant);
		
	    ZonedDateTime zonedDateTime = ZonedDateTime.now();
	    System.out.println("zonedDateTime = "+zonedDateTime);
		/*
		 * Parameters:
		 * 
		 * temporal - the target object to be adjusted, not null
		 * 
		 * Returns:
		 * 
		 * the adjusted object, not null
		 */
	    Temporal temporal = instant.adjustInto(zonedDateTime);
	    System.out.println("temporal = "+temporal);

	}

}
