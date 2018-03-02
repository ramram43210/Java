import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.now();
		System.out.println(yearMonth);

		/*
		 * Returns:
		 * 
		 * the length of the month in days, from 28 to 31
		 */
		int lengthOfMonth = yearMonth.lengthOfMonth();
		System.out.println("lengthOfMonth = " + lengthOfMonth);

		/*
		 * Returns:
		 * 
		 * 366 if the year is leap, 365 otherwise
		 */
		int lengthOfYear = yearMonth.lengthOfYear();
		System.out.println("lengthOfYear = " + lengthOfYear);
	}

}
