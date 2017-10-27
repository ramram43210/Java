import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class YearDemo2
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);

		/*
		 * Returns:
		 * 
		 * the year, MIN_VALUE to MAX_VALUE
		 */
		
		ValueRange valueRange = year.range(ChronoField.YEAR);		
		System.out.println(valueRange);
		System.out.println("Min = "+valueRange.getMinimum());
		System.out.println("Max = "+valueRange.getMaximum());
	}
	

}
