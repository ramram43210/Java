import java.util.Date;
import java.util.TimeZone;

public class TimeZoneDemo2
{
	public static void main(String[] args)
	{
		TimeZone timezoneone = TimeZone.getDefault();

		Date date = new Date();

		/*
		 * Parameters:
		 * 
		 * date - the given Date.
		 * 
		 * Returns:
		 * 
		 * true if the given date is in Daylight Saving Time, false,
		 * otherwise.
		 */
		boolean result = timezoneone.inDaylightTime(date);
		System.out.println(result);
	}
}
