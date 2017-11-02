import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class YearMonthDemo2
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.now();

		System.out.println("yearMonth1 = " + yearMonth1);

		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount of the unit to subtract from
		 * the result, may be negative
		 * 
		 * unit - the unit of the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the specified
		 * amount subtracted, not null
		 */
		YearMonth yearMonth2 = yearMonth1.minus(30, ChronoUnit.YEARS);
		System.out.println("yearMonth2 = " + yearMonth2);

		YearMonth yearMonth3 = yearMonth2.minus(1, ChronoUnit.MONTHS);
		System.out.println("yearMonth3 = " + yearMonth3);

	}

}
