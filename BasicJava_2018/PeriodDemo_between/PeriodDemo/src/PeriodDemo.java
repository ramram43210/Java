import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		LocalDate startDate = LocalDate.of(2010, Month.JANUARY, 21);
		System.out.println("startDate = " + startDate);

		LocalDate endDate = LocalDate.of(2025, Month.JANUARY, 21);
		System.out.println("endDate = " + endDate);

		/*
		 * Parameters:
		 * 
		 * startDateInclusive - the start date, inclusive, not null
		 * endDateExclusive - the end date, exclusive, not null
		 * 
		 * Returns:
		 * 
		 * the period between this date and the end date, not null
		 */
		Period period = Period.between(startDate, endDate);
		System.out.println("period = " + period);
	}

}
