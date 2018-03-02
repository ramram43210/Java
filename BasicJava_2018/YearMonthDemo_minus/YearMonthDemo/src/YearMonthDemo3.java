import java.time.Period;
import java.time.YearMonth;

public class YearMonthDemo3
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.now();
		System.out.println("yearMonth1 = " + yearMonth1);

		Period period = Period.ofYears(9);
		System.out.println("period = " + period);

		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this year-month with the subtraction
		 * made, not null
		 */
		YearMonth yearMonth2 = yearMonth1.minus(period);
		System.out.println("yearMonth2 = " + yearMonth2);
	}

}
