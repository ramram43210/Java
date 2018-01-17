import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println(localDateTime1);
		
		/*
		 * Parameters:
		 * 
		 * unit - the unit to truncate to, not null
		 * 
		 * Returns:
		 * 
		 * a LocalDateTime based on this date-time with the
		 * time truncated, not null
		 */
		LocalDateTime localDateTime2 = localDateTime1
				.truncatedTo(ChronoUnit.DAYS);
		
		System.out.println(localDateTime2);

	}

}
