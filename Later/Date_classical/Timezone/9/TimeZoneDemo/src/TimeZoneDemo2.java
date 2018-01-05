import java.util.TimeZone;

public class TimeZoneDemo2
{
	public static void main(String[] args)
	{

		TimeZone defaultTimeZone = TimeZone.getDefault();
		System.out.println("Before Set, defaultTimeZone = " + defaultTimeZone);

		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");

		/*
		 * Parameters:
		 * 
		 * zone - the new default TimeZone, or null
		 */
		TimeZone.setDefault(timeZone);

		defaultTimeZone = TimeZone.getDefault();
		System.out.println("After Set, defaultTimeZone = " + defaultTimeZone);
	}
}
