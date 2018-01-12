import java.time.Clock;
import java.time.LocalTime;

public class LocalTimeDemo1
{

	public static void main(String[] args)
	{
		Clock clock = Clock.systemUTC();

		/*
		 * Parameters:
		 * 
		 * clock - the clock to use, not null
		 * 
		 * Returns: 
		 * 
		 * the current time, not null
		 */
		LocalTime time = LocalTime.now(clock);
		System.out.println(time);
	}

}
