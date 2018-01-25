import java.time.MonthDay;
import java.time.ZoneId;

public class MonthDayDemo2
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
		 * the current month-day using the system clock, not
		 * null
		 */
		MonthDay monthDay = MonthDay.now(zoneId);
		System.out.println(monthDay);
	}

}
