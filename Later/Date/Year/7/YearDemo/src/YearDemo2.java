import java.time.Year;

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
		
		int yearValue = year.getValue();		
		System.out.println(yearValue);
	}
	

}
