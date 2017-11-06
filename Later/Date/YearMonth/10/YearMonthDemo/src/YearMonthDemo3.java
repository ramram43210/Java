import java.time.YearMonth;

public class YearMonthDemo3
{
	public static void main(String[] args)
	{
		YearMonth yearMonth = YearMonth.of(2017,11);
		System.out.println("yearMonth = "+yearMonth);

		/*
		 * Parameters:
		 *
		 * dayOfMonth - the day-of-month to validate, from 1 to 31,
		 * invalid value returns false
		 *
		 * Returns:
		 *
		 * true if the day is valid for this year-month
		 */
		
		boolean isValidMonthDay = yearMonth.isValidDay(12);
		System.out.println("Day 12 isValidMonthDay = "+isValidMonthDay);
		
		isValidMonthDay = yearMonth.isValidDay(31);
		System.out.println("Day 31 isValidMonthDay = "+isValidMonthDay);
	}

}
