import java.time.MonthDay;
import java.time.ZonedDateTime;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:the month-day, not null
		 */
		MonthDay monthDay = MonthDay.from(ZonedDateTime.now());
		System.out.println(monthDay);
	}

}
