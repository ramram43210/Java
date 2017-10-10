import java.time.OffsetTime;
import java.time.ZonedDateTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:the offset time, not null
		 */
		OffsetTime offsetTime = OffsetTime.from(ZonedDateTime.now());
		System.out.println("offsetTime           = " + offsetTime);
	}

}
