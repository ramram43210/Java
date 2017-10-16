import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1
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
		 * preferredOffset - the zone offset, null if no preference
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.ofLocal(localDateTime, ZoneId.systemDefault(),ZoneOffset.UTC );
		System.out.println(zonedDateTime);

	}

}
