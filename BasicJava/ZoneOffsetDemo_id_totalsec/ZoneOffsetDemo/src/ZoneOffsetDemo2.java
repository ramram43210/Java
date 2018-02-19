import java.time.ZoneOffset;

public class ZoneOffsetDemo2
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.of("+01:00");
		System.out.println("zoneOffset = "+zoneOffset);
		/*
		 * Returns:the total zone offset amount in seconds
		 */
		int totalSeconds = zoneOffset.getTotalSeconds();
		System.out.println("totalSeconds = "+totalSeconds);
	}

}
