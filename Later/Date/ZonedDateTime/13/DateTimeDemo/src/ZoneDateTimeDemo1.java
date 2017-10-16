import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1
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
		 * zone - the time-zone, not null
		 * 
		 * Returns:the zoned date-time, not null
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant,ZoneId.systemDefault());
		System.out.println(zonedDateTime);

	}

}
