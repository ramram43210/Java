import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);

		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:
		 * 
		 * the zoned date-time, not null
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.from(offsetDateTime);
		System.out.println(zonedDateTime);
	}

}
