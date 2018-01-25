import java.time.Clock;
import java.time.MonthDay;

public class MonthDayDemo1
{
	public static void main(String[] args)
	{
		Clock clock = Clock.systemUTC();
		System.out.println(clock);
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:
		 * 
		 * the current month-day, not null
		 */
		MonthDay monthDay = MonthDay.now(clock);
		System.out.println(monthDay);

	}

}
