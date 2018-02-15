import java.time.ZoneId;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the zone ID, not null
		 */
		ZoneId zoneId = ZoneId.systemDefault();

		/*
		 * Returns:the time-zone unique ID, not null
		 */
		String strZoneId = zoneId.getId();
		System.out.println(strZoneId);
	}

}
