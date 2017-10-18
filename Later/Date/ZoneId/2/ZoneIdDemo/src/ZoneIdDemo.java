import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * a modifiable copy of the set of zone IDs, not null
		 */
		Set<String> zoneIdSet = ZoneId.getAvailableZoneIds();
		for (String zoneId : zoneIdSet)
		{
			System.out.println(zoneId);
		}
	}

}
