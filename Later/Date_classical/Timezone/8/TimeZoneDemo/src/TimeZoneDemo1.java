import java.util.TimeZone;

public class TimeZoneDemo1
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();

		/*
		 * Returns:
		 * 
		 * true if this TimeZone is currently in Daylight Saving Time,
		 * or if a transition from Standard Time to Daylight Saving
		 * Time occurs at any future time; false otherwise.
		 */
		boolean result = timeZone.observesDaylightTime();
		System.out.println(result);
	}
}
