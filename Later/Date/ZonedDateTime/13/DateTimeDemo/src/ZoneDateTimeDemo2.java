import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo2
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * localDateTime - the local date-time, not null
		 * 
		 * offset - the zone offset, not null
		 * 
		 * zone - the time-zone, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 * 
		 */

		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(localDateTime, ZoneOffset.UTC,ZoneId.systemDefault());
		System.out.println(zonedDateTime);
	}

}
