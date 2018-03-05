import java.time.LocalDate;
import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.of(2014, 11);
		System.out.println("yearMonth = " + yearMonth);

		/*
		 * Parameters:
		 * 
		 * dayOfMonth - the day-of-month to use, from 1 to 31
		 * 
		 * Returns:
		 * 
		 * the date formed from this year-month and the specified day,
		 * not null
		 */
		LocalDate localDate = yearMonth.atDay(2);
		System.out.println("localDate atDay(2) = " + localDate);

		/*
		 * Returns:
		 * 
		 * the last valid date of this year-month, not null
		 */
		localDate = yearMonth.atEndOfMonth();
		System.out.println("localDate atEndOfMonth() = " + localDate);

	}

}
