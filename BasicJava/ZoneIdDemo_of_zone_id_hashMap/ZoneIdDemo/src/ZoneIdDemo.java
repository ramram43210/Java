import java.time.ZoneId;
import java.util.HashMap;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * zoneId - the time-zone ID, not null
		 * 
		 * aliasMap - a map of alias zone IDs (typically
		 * abbreviations) to real zone IDs, not null
		 * 
		 * Returns:
		 * 
		 * the zone ID, not null
		 */
		ZoneId zoneId = ZoneId.of("UTC", new HashMap<>());

		System.out.println(zoneId);
	}

}
