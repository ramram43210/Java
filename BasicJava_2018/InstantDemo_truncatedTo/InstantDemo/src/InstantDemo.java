import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2014-12-03T10:15:30.00Z");
		System.out.println(instant);

		/*
		 * Parameters:
		 * 
		 * unit - the unit to truncate to, not null
		 * 
		 * Returns:
		 * 
		 * an Instant based on this instant with the time
		 * truncated, not null
		 */
		instant = instant.truncatedTo(ChronoUnit.DAYS);
		System.out.println(instant);

	}

}
