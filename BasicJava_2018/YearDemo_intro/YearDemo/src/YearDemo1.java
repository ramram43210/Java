import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Returns:
		 *
		 * the current year using the system clock and default
		 * time-zone, not null
		 */
		Year year = Year.now();
		System.out.println(year);
	}

}
