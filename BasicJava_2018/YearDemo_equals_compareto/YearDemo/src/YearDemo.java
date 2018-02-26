import java.time.Year;

public class YearDemo
{

	public static void main(String[] args)
	{
		Year year1 = Year.of(2014);
		System.out.println("year1 = "+year1);
		
		Year year2 = Year.of(2018);
		System.out.println("year2 = "+year2);

		/*
		 * Parameters:
		 * 
		 * obj - the object to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if this is equal to the other year
		 */
		boolean isEqual = year1.equals(year2);
		System.out.println(year1+" is equal to "+year2+" = "+isEqual);

		/*
		 * Parameters:
		 * 
		 * other - the other year to compare to, not null
		 * 
		 * Returns:
		 * 
		 * the comparator value, negative if less, positive if greater
		 */

		int result = year1.compareTo(year2);
		System.out.println(year1+" compare to "+year2+" = "+result);
	}

}
