import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);


		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:
		 * 
		 * the offset date-time, not null
		 */
		OffsetDateTime offsetDateTime = OffsetDateTime.from(zonedDateTime);
		System.out.println(offsetDateTime);

	}

}
