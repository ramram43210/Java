import java.util.TimeZone;

public class TimeZoneDemo2
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();

		/*
		 * Returns:
		 * 
		 * true if this TimeZone uses Daylight Saving Time, false,
		 * otherwise.
		 */
		boolean result = timeZone.useDaylightTime();
		System.out.println(result);
	}
}
