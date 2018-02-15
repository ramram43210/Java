import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZoneIdDemo
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
		ZoneId zoneId1 = ZoneId.of("Asia/Kolkata");
		System.out.println(zoneId1);
		LocalDateTime localDateTime1 = LocalDateTime.now(zoneId1);
		System.out.println(localDateTime1);
		
		System.out.println();
		
		ZoneId zoneId2 = ZoneId.of("Australia/Sydney");
		System.out.println(zoneId2);
		LocalDateTime localDateTime2 = LocalDateTime.now(zoneId2);
		System.out.println(localDateTime2);
	}

}
