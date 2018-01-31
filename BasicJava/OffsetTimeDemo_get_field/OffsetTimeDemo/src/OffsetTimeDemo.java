import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{
		OffsetTime offsetTime = OffsetTime.now();
		System.out.println("offsetTime = " + offsetTime);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns: 
		 * 
		 * the value for the field
		 * 
		 */
		int hour = offsetTime.get(ChronoField.HOUR_OF_DAY);
		System.out.println("hour = " + hour);

		int minute = offsetTime.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println("minute = " + minute);

		int seconds = offsetTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("seconds = " + seconds);
	}

}
