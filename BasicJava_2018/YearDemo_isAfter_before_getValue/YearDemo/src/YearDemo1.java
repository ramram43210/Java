import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		Year year1 = Year.of(2017);
		System.out.println("year1 = "+year1);
		
		Year year2 = Year.of(2014);
		System.out.println("year2 = "+year2);

		/*
		 * Parameters:
		 * 
		 * other - the other year to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this is after the specified year
		 */
		boolean result = year1.isAfter(year2);
		System.out.println(year1+" is after "+year2+" = "+result);

		/*
		 * Parameters:
		 * 
		 * other - the other year to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this point is before the specified year
		 */

		result = year1.isBefore(year2);
		System.out.println(year1+" is before "+year2+" = "+result);
	}

}
