import java.time.LocalDateTime;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns: 
		 * 
		 * the current date-time using the system clock and
		 * default time-zone, not null
		 */
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}

}
