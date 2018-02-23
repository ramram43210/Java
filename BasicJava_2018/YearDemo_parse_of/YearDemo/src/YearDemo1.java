import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "2007", not null
		 * 
		 * Returns:
		 * 
		 * the parsed year, not null
		 */
		Year year = Year.parse("2017");
		System.out.println(year);
	}

}
