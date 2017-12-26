import java.util.TimeZone;

public class TimeZoneDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * rawOffset - the given time zone GMT offset in milliseconds.
		 * 
		 * Returns:an array of IDs, where the time zone for that ID
		 * has the specified GMT offset. For example,
		 * "America/Phoenix" and "America/Denver" both have GMT-07:00,
		 * but differ in daylight saving behavior.
		 */
		String[] availableIDArray = TimeZone.getAvailableIDs(3600000);

		System.out.println("Available Ids for offset are: ");
		for (String availableID : availableIDArray)
		{
			System.out.println(availableID);
		}
	}
}
