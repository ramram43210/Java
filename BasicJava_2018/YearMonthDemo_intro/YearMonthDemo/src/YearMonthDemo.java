import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		/*
		 * Returns:
		 * 
		 * the current year-month using the system clock and default
		 * time-zone, not null
		 */
		YearMonth yearMonth = YearMonth.now();
		System.out.println(yearMonth);

	}

}
