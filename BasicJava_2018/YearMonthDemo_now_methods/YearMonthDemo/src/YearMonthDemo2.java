import java.time.YearMonth;
import java.time.ZoneId;

public class YearMonthDemo2
{

	public static void main(String[] args)
	{

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("zoneId = "+zoneId);
		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:
		 * 
		 * the current year-month using the system clock, not null
		 */
		YearMonth yearMonth = YearMonth.now(zoneId);
		System.out.println("yearMonth = "+yearMonth);
	}

}
