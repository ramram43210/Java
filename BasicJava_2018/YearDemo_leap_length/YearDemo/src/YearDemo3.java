import java.time.Year;

public class YearDemo3
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);
		System.out.println(year);
		
		/*
		 * Returns:
		 * 
		 * the length of this year in days, 365 or 366
		 */
		int length = year.length();
		
		System.out.println("length = " + length);

	}

}
