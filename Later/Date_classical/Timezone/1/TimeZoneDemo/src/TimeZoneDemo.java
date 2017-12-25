import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		/*
		 * Returns: the default TimeZone
		 */
		TimeZone timeZone = TimeZone.getDefault();
		String displayName = timeZone.getDisplayName();
		System.out.println("displayName = " + displayName);
	}
}
