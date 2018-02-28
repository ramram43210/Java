import java.time.Clock;
import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		Clock clock = Clock.systemDefaultZone();
		System.out.println("clock = "+clock);
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:
		 * 
		 * the current year-month, not null
		 */
		YearMonth yearMonth = YearMonth.now(clock);
		System.out.println("yearMonth = "+yearMonth);

	}

}
