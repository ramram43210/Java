import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth1 = YearMonth.of(2016, 03);
		System.out.println("yearMonth1 = "+yearMonth1);
		
		YearMonth yearMonth2 = YearMonth.of(2017, 03);
		System.out.println("yearMonth2 = "+yearMonth2);
				
		/*
		 * Parameters:
		 * 
		 * other - the other year-month to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this is after the specified year-month
		 */
		boolean result = yearMonth1.isAfter(yearMonth2);
		System.out.println(yearMonth1+" is after "+yearMonth2+" = "+result);

		/*
		 * Parameters:
		 * 
		 * other - the other year-month to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this point is before the specified year-month
		 */

		result = yearMonth1.isBefore(yearMonth2);
		System.out.println(yearMonth1+" is before "+yearMonth2+" = "+result);

	}

}
