import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZoneIdDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * zoneId - the time-zone ID, not null
		 * 
		 * Returns:
		 * 
		 * the zone ID, not null
		 */
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
		ZoneId zoneid2 = ZoneId.of("Australia/Sydney");
		LocalDateTime localDateTime1 = LocalDateTime.now(zoneid1);
		LocalDateTime localDateTime2 = LocalDateTime.now(zoneid2);
		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
	}

}
