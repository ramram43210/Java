import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo1
{

	public static void main(String[] args)
	{

		OffsetTime offsetTime = OffsetTime.now();
		System.out.println("offsetTime = "+offsetTime);
		
		int hour = offsetTime.getHour();
		System.out.println("hour = "+ hour);
		
		int minute = offsetTime.getMinute();
		System.out.println("minute = "+minute);
		
		int seconds = offsetTime.getSecond();
		System.out.println("seconds = "+seconds);
		
		int nanoSeconds = offsetTime.getNano();
		System.out.println("nanoSeconds = "+nanoSeconds);
		
		ZoneOffset zoneOffset = offsetTime.getOffset();
		System.out.println("zoneOffset = "+zoneOffset.getId());
	}

}
