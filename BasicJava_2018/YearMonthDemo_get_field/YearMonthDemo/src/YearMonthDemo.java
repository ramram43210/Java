import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthDemo
{

	public static void main(String[] args)
	{
		YearMonth yearMonth = YearMonth.now();
		System.out.println("yearMonth = " + yearMonth);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		int year = yearMonth.get(ChronoField.YEAR);
		System.out.println("year = " + year);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		int monthValue = yearMonth.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthValue = " + monthValue);
	}

}
