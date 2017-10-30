import java.time.Year;
import java.time.temporal.ChronoUnit;

public class YearDemo3
{

	public static void main(String[] args)
	{
		Year year1 = Year.of(2017);
		Year year2 = Year.of(2030);

		/*
		 * Parameters:
		 * 
		 * endExclusive - the end date, exclusive, which is converted
		 * to a Year, not null
		 * 
		 * unit - the unit to measure the amount in, not null
		 * 
		 * Returns:
		 * 
		 * the amount of time between this year and the end year
		 */
		long l = year1.until(year2, ChronoUnit.YEARS);
		System.out.println(l);

	}

}
