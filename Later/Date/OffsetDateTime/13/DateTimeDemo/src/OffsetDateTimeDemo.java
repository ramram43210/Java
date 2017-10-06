import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:the current date-time, not null
		 */
		OffsetDateTime offsetDateTime1 = OffsetDateTime.now(Clock.systemUTC());
		System.out.println(offsetDateTime1);
		
		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:the current date-time using the system clock, not
		 * null
		 */
		OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.systemDefault());
	    System.out.println(offsetDateTime2); 

	}

}
