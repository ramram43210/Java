import java.time.Year;
import java.time.temporal.ChronoUnit;

public class YearDemo2
{

	public static void main(String[] args)
	{
		Year year1 = Year.of(2017);
		System.out.println("year1 = " + year1);

		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount of the unit to subtract from
		 * the result, may be negative
		 * 
		 * unit - the unit of the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * a Year based on this year with the specified amount
		 * subtracted, not null
		 */
		Year year2 = year1.minus(5, ChronoUnit.YEARS);
		System.out.println("year2 = " + year2);
	}

}
