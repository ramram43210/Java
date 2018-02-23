import java.time.Clock;
import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{
		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock);
		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns:the current year, not null
		 */
		Year year = Year.now(clock);
		System.out.println(year);
	}

}
