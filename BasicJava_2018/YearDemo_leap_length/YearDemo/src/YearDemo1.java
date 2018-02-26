import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);
		System.out.println(year);
	
		/*
		 * Returns:
		 * 
		 * true if the year is leap, false otherwise
		 */
		boolean isLeap = year.isLeap();
		System.out.println(year+ " is a leap year? = " + isLeap);
	}

}
