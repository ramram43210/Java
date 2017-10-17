import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now(Clock.systemUTC());
		System.out.println(zonedDateTime1);
		
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.systemDefault());
	    System.out.println(zonedDateTime2);
	}

}
