import java.time.Year;
import java.time.ZoneId;

public class YearDemo2
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:
		 * 
		 * the current year using the system clock, not null
		 */
		Year year = Year.now(zoneId);
		System.out.println(year);
	}

}
