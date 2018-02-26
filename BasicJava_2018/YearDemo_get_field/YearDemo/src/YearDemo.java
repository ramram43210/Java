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
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */

		int yearValue1 = year.get(ChronoField.YEAR);
		System.out.println(yearValue1);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		long yearValue2 = year.getLong(ChronoField.YEAR);
		System.out.println(yearValue2);

	}

}
