import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		/*
		 * Returns:
		 * 
		 * the current time using the system clock and default
		 * time-zone, not null
		 */
		OffsetTime currentTime = OffsetTime.now();
		System.out.println("currentTime = " + currentTime);

		int hour = currentTime.getHour();
		System.out.println("hour = " + hour);

		int minute = currentTime.getMinute();
		System.out.println("minute = " + minute);

		int seconds = currentTime.getSecond();
		System.out.println("seconds = " + seconds);

		int nanoSeconds = currentTime.getNano();
		System.out.println("nanoSeconds = " + nanoSeconds);

		ZoneOffset zoneOffset = currentTime.getOffset();
		System.out.println("zoneOffset = " + zoneOffset.getId());
	}

}
