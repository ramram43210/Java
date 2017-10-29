import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		Year year1 = Year.of(2017);
		System.out.println("year1 = " + year1);

		/*
		 * Parameters:
		 * 
		 * yearsToAdd - the years to add, may be negative
		 * 
		 * Returns:
		 * 
		 * a Year based on this year with the years added, not null
		 */
		Year year2 = year1.plusYears(2);
		System.out.println("year2 = " + year2);
	}

}
