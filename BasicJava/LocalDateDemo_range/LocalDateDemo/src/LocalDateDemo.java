import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.parse("2017-12-03");

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ValueRange dayOfMonthRange = date.range(ChronoField.DAY_OF_MONTH);
		System.out.println("dayOfMonthRange = "+dayOfMonthRange);
		System.out.println("Max DayOfMonth = "+ dayOfMonthRange.getMaximum());
		System.out.println("Min DayOfMonth = "+ dayOfMonthRange.getMinimum());
		
		System.out.println("--------------------------");
		
		ValueRange monthOfYearRange = date.range(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYearRange = "+monthOfYearRange);
		System.out.println("Max MonthOfYear = "+ monthOfYearRange.getMaximum());
		System.out.println("Min MonthOfYear = "+ monthOfYearRange.getMinimum());
		
		System.out.println("--------------------------");
		
		ValueRange dayOfYearRange = date.range(ChronoField.DAY_OF_YEAR);
		System.out.println("dayOfYearRange = "+dayOfYearRange);
		System.out.println("Max DayOfYear = "+ dayOfYearRange.getMaximum());
		System.out.println("Min DayOfYear = "+ dayOfYearRange.getMinimum());
		
	}

}
