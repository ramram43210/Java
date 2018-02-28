import java.time.Year;
import java.time.temporal.ChronoField;

public class YearDemo
{

	public static void main(String[] args)
	{

		Year year1 = Year.of(2017);
		System.out.println("year1 = " + year1);

		/*
		 * Returns a copy of this year with the specified field set to
		 * a new value.
		 * 
		 * Parameters:
		 * 
		 * field - the field to set in the result, not null
		 * 
		 * newValue - the new value of the field in the result
		 * 
		 * Returns:
		 * 
		 * a Year based on this with the specified field set, not null
		 */
		Year year2 = year1.with(ChronoField.YEAR, 2050);
		System.out.println("year2 = " + year2);

	}

}
