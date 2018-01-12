import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo
{

	public static void main(String[] args)
	{
		ZoneId zoneId1 = ZoneId.of("Asia/Kolkata");

		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:
		 * 
		 * the current time using the system clock, not null
		 */
		LocalTime indiaTime = LocalTime.now(zoneId1);
		System.out.println("indiaTime   = " + indiaTime);

		ZoneId zoneId2 = ZoneId.of("Asia/Bangkok");
		LocalTime bangkokTime = LocalTime.now(zoneId2);
		System.out.println("bangkokTime = " + bangkokTime);

		long hours = ChronoUnit.HOURS.between(indiaTime, bangkokTime);
		System.out.println("\nHours between two Time Zone =  " + hours);

		long minutes = ChronoUnit.MINUTES.between(indiaTime, bangkokTime);
		System.out.println("Minutes between two time zone =  " + minutes);
	}

}
