import java.time.Year;

public class YearDemo2
{

	public static void main(String[] args)
	{
		/*
		 * The minimum supported year
		 */
		int minYear = Year.MIN_VALUE;
		System.out.println("Minimum supported year = "+minYear);
		
		/*
		 * The maximum supported year
		 */
		int maxYear = Year.MAX_VALUE;
		System.out.println("Maximum supported year =  "+maxYear);
	}

}
