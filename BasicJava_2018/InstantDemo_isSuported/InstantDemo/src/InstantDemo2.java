import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo2
{
	public static void main(String[] args)
	{
		Instant instant = Instant.parse("2014-12-03T10:15:30.00Z");
		
		/*
		 * Parameters:
		 * 
		 * unit - the unit to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the unit can be added/subtracted, false if not
		 */
	    System.out.println(instant.isSupported(ChronoUnit.DAYS));
	    System.out.println(instant.isSupported(ChronoUnit.WEEKS));
	}

}
