import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		/*
		 * Returns:the rules, not null
		 */
		ZoneRules zoneRules = zoneId.getRules();
		System.out.println(zoneRules);
	}

}
