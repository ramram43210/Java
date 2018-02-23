import java.time.Year;

public class YearDemo3
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * isoYear - the ISO proleptic year to represent, from MIN_VALUE to MAX_VALUE
		 * 
		 * Returns:
		 * 
		 * the year, not null
		 */
		Year year =  Year.of(2017);
		System.out.println(year);
	}

}
