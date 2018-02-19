import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.UTC;
		System.out.println("zoneOffset = " + zoneOffset);

		/*
		 * Returns:the rules, not null
		 */
		ZoneRules zoneRules = zoneOffset.getRules();
		System.out.println(zoneRules);

	}

}
