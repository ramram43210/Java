import java.time.LocalDate;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println("date                  = " + date);

		/*
		 * Parameters:
		 * 
		 * dayOfMonth - the day-of-month to set in the result, from 1
		 * to 28-31
		 * 
		 * Returns:a LocalDate based on this date with the requested
		 * day, not null
		 */
		LocalDate dateAfterDayChanged = date.withDayOfMonth(30);
		System.out.println("dateAfterDayChanged   = " + dateAfterDayChanged);

		/*
		 * Parameters:
		 * 
		 * month - the month-of-year to set in the result, from 1
		 * (January) to 12 (December)
		 * 
		 * Returns:a LocalDate based on this date with the requested
		 * month, not null
		 */
		LocalDate dateAfterMonthChanged = date.withMonth(2);
		System.out.println("dateAfterMonthChanged = " + dateAfterMonthChanged);

		/*
		 * Parameters:
		 * 
		 * year - the year to set in the result, from MIN_YEAR to
		 * MAX_YEAR
		 * 
		 * Returns:a LocalDate based on this date with the requested
		 * year, not null
		 */
		LocalDate dateAfterYearChanged = date.withYear(2050);
		System.out.println("dateAfterYearChanged  = " + dateAfterYearChanged);

	}

}
