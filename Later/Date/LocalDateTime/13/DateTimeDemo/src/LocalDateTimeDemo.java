import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * instant - the instant to create the date-time from, not null
		 * zone - the time-zone, which may be an offset, not null
		 * 
		 * Returns:the local date-time, not null
		 */
		  LocalDateTime date = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault() );
	      System.out.println(date);
	}

}
