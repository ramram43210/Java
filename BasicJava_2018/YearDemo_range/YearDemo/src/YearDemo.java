import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class YearDemo
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);

		/*
		 * Returns:
		 * 
		 * the year, MIN_VALUE to MAX_VALUE
		 */

		ValueRange range = year.range(ChronoField.YEAR);
		System.out.println(range);
		System.out.println("Min = " + range.getMinimum());
		System.out.println("Max = " + range.getMaximum());
	}

}
