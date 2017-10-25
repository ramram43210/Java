import java.time.ZoneOffset;

public class ZoneOffsetDemo1
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.UTC;

		/*
		 * Returns:the zone offset ID, not null
		 */
		String id = zoneOffset.getId();
		System.out.println(id);
	}

}
