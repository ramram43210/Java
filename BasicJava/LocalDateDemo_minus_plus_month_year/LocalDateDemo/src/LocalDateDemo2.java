import java.time.LocalDate;

public class LocalDateDemo2
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println("date = " + date);

		/*
		 * Parameters:
		 * 
		 * monthsToAdd - the months to add, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the months
		 * added, not null
		 */
		LocalDate dateAfterMonthChanged = date.plusMonths(2);
		System.out.println("dateAfterMonthChanged = " + dateAfterMonthChanged);

		/*
		 * Parameters:
		 * 
		 * yearsToAdd - the years to add, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the years
		 * added, not null
		 */

		LocalDate dateAfterYearChanged = date.plusYears(5);
		System.out.println("dateAfterYearChanged = " + dateAfterYearChanged);
	}

}
