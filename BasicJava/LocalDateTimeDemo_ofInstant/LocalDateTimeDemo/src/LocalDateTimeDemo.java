import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{

		Instant instant = Instant.now();
		System.out.println("instant = "+instant);

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("zoneId = "+zoneId);
		/*
		 * Parameters:
		 * 
		 * instant - the instant to create the date-time from, not
		 * null
		 * 
		 * zone - the time-zone, which may be an offset, not null
		 * 
		 * Returns:the local date-time, not null
		 */
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
		System.out.println("localDateTime = "+localDateTime);
	}

}
