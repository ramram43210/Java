import java.time.LocalDate;

public class LocalDateDemo1
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println("date = " + date);

		/*
		 * Parameters:
		 * 
		 * monthsToSubtract - the months to subtract, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the months
		 * subtracted, not null
		 */
		LocalDate dateAfterMonthChanged = date.minusMonths(2);
		System.out.println("dateAfterMonthChanged = " + dateAfterMonthChanged);

		/*
		 * Parameters:
		 * 
		 * yearsToSubtract - the years to subtract, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the years
		 * subtracted, not null
		 */
		LocalDate dateAfterYearChanged = date.minusYears(3);
		System.out.println("dateAfterYearChanged = " + dateAfterYearChanged);
	}

}
