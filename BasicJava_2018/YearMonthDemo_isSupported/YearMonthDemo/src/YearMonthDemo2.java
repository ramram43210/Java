import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class YearMonthDemo2
{
	public static void main(String[] args)
	{
		YearMonth yearMonth = YearMonth.now();

		/*
		 * Parameters:
		 * 
		 * unit - the unit to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the unit can be added/subtracted, false if not
		 */
		boolean isYearSupported = yearMonth.isSupported(ChronoUnit.YEARS);
		System.out.println("isYearSupported = " + isYearSupported);

		boolean isDaysSupported = yearMonth.isSupported(ChronoUnit.DAYS);
		System.out.println("isDaysSupported = " + isDaysSupported);
	}

}
