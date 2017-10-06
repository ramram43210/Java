import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class OffsetDateTimeDemo4
{

	public static void main(String[] args)
	{
		Instant instant = Instant.now();
	    
		/*
		 * Parameters:
		 *
		 * instant - the instant to create the date-time from, not
		 * null
		 *
		 * zone - the time-zone, which may be an offset, not null
		 *
		 * Returns:
		 *
		 * the offset date-time, not null
		 */
	    OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant,ZoneId.systemDefault());
	    System.out.println(offsetDateTime); 
	}

}
