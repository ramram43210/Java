import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.of(2016, 03);
		YearMonth yearMonth2 = YearMonth.of(2017, 03);

		/*
		 * Parameters:
		 *
		 * obj - the object to check, null returns false
		 *
		 * Returns:
		 *
		 * true if this is equal to the other year-month
		 */
		boolean isEqual = yearMonth1.equals(yearMonth2);
		System.out.println(yearMonth1 + " is equal to " + yearMonth2 + " = " + isEqual);

		/*
		 * Parameters:
		 * 
		 * other - the other year-month to compare to, not null
		 * 
		 * Returns:
		 * 
		 * the comparator value, negative if less, positive if greater
		 */

		int result = yearMonth1.compareTo(yearMonth2);
		System.out.println(yearMonth1 + " compare to " + yearMonth2	+ " = " + result);

	}

}
