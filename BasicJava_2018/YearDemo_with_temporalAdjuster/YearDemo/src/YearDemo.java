import java.time.Year;

public class YearDemo
{

	public static void main(String[] args)
	{

		Year year1 = Year.of(2017);
		System.out.println("year1 = "+year1);
		
		Year year2 = Year.of(2020);
		System.out.println("year2 = "+year2);

		/*
		 * Parameters:
		 * 
		 * adjuster - the adjuster to use, not null
		 * 
		 * Returns:
		 * 
		 * a Year based on this with the adjustment made, not null
		 */
		Year year3 = year1.with(year2);
		System.out.println("year3 = "+year3);
		
	}

}
