import java.time.Clock;
import java.time.MonthDay;
import java.time.ZoneId;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:the current month-day, not null
		 */
		MonthDay monthDay1 = MonthDay.now(Clock.systemUTC());
		System.out.println(monthDay1);

		/*
		 * Parameters:
		 * 
		 * zone - the zone ID to use, not null
		 * 
		 * Returns:the current month-day using the system clock, not null
		 */
		MonthDay monthDay2 = MonthDay.now(ZoneId.systemDefault());
		System.out.println(monthDay2);

	}

}
