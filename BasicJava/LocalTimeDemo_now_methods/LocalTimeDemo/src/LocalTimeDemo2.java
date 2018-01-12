import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo2
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:
		 * 
		 * the current time using the system clock, not null
		 */
		LocalTime time = LocalTime.now(zoneId);
		System.out.println(time);
	}

}
