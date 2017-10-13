import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:the zoned date-time, not null
		 */
		 ZonedDateTime zonedDateTime = ZonedDateTime.from(ZonedDateTime.now());
	     System.out.println(zonedDateTime); 
	}

}
