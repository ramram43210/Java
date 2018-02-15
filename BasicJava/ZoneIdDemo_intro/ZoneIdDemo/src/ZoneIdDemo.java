import java.time.ZoneId;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the zone ID, not null
		 */
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

	}

}
