import java.time.YearMonth;

public class YearMonthDemo2
{
	public static void main(String[] args)
	{
		YearMonth yearMonth1 = YearMonth.of(2014, 11);
		System.out.println("yearMonth1 = " + yearMonth1);

		/*
		 * Parameters:
		 * 
		 * adjuster - the adjuster to use, not null
		 * 
		 * Returns:
		 * 
		 * a YearMonth based on this with the adjustment made, not
		 * null
		 */
		YearMonth yearMonth2 = yearMonth1.with(YearMonth.of(2013, 01));
		System.out.println("yearMonth2 = " + yearMonth2);
	}

}
