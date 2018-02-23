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
		 * amountToAdd - the amount of the unit to add to the result,
		 * may be negative
		 * 
		 * unit - the unit of the amount to add, not null
		 * 
		 * Returns:
		 * 
		 * a Year based on this year with the specified amount added,
		 * not null
		 */
		Year year2 = year1.plus(5, ChronoUnit.YEARS);
		System.out.println("year2 = " + year2);
	}

}
