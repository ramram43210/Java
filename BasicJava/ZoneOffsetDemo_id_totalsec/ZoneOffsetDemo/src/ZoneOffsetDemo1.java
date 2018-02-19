import java.time.ZoneOffset;

public class ZoneOffsetDemo1
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.UTC;
		System.out.println("zoneOffset = "+zoneOffset);

		/*
		 * Returns:the zone offset ID, not null
		 */
		String id = zoneOffset.getId();
		System.out.println("id = "+id);
	}

}
