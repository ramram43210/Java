import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);
	
		/*
		 * Returns:
		 * 
		 * true if the year is leap, false otherwise
		 */
		boolean isLeap = year.isLeap();
		System.out.println("2017 isLeap = " + isLeap);
	}

}
