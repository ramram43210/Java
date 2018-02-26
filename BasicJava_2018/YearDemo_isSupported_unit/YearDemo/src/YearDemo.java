import java.time.Year;
import java.time.temporal.ChronoUnit;

public class YearDemo
{

	public static void main(String[] args)
	{

		Year year = Year.of(2017);

		/*
		 * Parameters:
		 *
		 * unit - the unit to check, null returns false
		 *
		 * Returns:
		 *
		 * true if the unit can be added/subtracted, false if not
		 */
		boolean isYearSupported = year.isSupported(ChronoUnit.YEARS);
		System.out.println("isYearSupported = " + isYearSupported);

		boolean isDaysSupported = year.isSupported(ChronoUnit.DAYS);
		System.out.println("isDaysSupported = " + isDaysSupported);

	}

}
