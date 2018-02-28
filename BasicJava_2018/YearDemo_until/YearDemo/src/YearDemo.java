import java.time.Year;
import java.time.temporal.ChronoUnit;

public class YearDemo
{

	public static void main(String[] args)
	{

		Year year1 = Year.of(2017);
		System.out.println("year1 = " + year1);
		Year year2 = Year.of(2030);
		System.out.println("year2 = " + year2);

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
		long value = year1.until(year2, ChronoUnit.YEARS);
		System.out.println(value);

	}

}
