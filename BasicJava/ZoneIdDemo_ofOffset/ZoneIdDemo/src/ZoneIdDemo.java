import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * prefix - the time-zone ID, not null
		 * 
		 * offset - the offset, not null
		 * 
		 * Returns:
		 * 
		 * the zone ID, not null
		 */
		ZoneId zoneId = ZoneId.ofOffset("UTC", ZoneOffset.UTC);

		System.out.println(zoneId);
	}

}
