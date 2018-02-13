import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo3
{

	public static void main(String[] args)
	{

		LocalDateTime localDateTime = LocalDateTime.now();

		/*
		 * Parameters:
		 * 
		 * localDateTime - the local date-time, not null
		 * 
		 * zone - the time-zone, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,
				ZoneId.systemDefault());
		System.out.println(zonedDateTime);

	}

}
