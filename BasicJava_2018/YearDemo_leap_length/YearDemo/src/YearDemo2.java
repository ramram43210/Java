import java.time.Year;

public class YearDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * year - the year to check
		 * 
		 * Returns:
		 * 
		 * true if the year is leap, false otherwise
		 */
		boolean isLeap = Year.isLeap(2012);
		System.out.println("2012 is a Leap year? = " + isLeap);
		
		isLeap = Year.isLeap(2014);
		System.out.println("2014 is a Leap year? = " + isLeap);
	}
	

}
