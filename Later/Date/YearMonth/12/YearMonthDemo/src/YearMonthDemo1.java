import java.time.LocalDate;
import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.of(2014, 11);
		System.out.println("yearMonth1 = " + yearMonth1);

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
		LocalDate localDate = yearMonth1.atDay(2);
		System.out.println("localDate atDay(2) = " + localDate);

		/*
		 * Returns:
		 * 
		 * the last valid date of this year-month, not null
		 */
		localDate = yearMonth1.atEndOfMonth();
		System.out.println("localDate atEndOfMonth() = " + localDate);

	}

}
