import java.time.Year;
import java.time.temporal.ChronoField;

public class YearDemo
{

	public static void main(String[] args)
	{

		Year year = Year.of(2017);

		/*
		 * Parameters:
		 * 
		 * field - the field to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the field is supported on this year, false if not
		 */
		boolean isYearSupported = year.isSupported(ChronoField.YEAR);
		System.out.println("isYearSupported = "+isYearSupported);
		
		boolean isMonthYearSupported = year.isSupported(ChronoField.MONTH_OF_YEAR);
		System.out.println("isMonthYearSupported = "+isMonthYearSupported);

	}

}
