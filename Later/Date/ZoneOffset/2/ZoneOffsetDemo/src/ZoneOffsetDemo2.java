import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneOffsetDemo2
{

	public static void main(String[] args)
	{

		ZoneOffset zoneOffset = ZoneOffset.UTC;
		
		/*
		 * Returns:the rules, not null
		 */
	    ZoneRules zoneRules = zoneOffset.getRules();
	    System.out.println(zoneRules);
	}

}
