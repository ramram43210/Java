import java.time.Clock;
import java.time.Instant;

public class ClockDemo2
{

	public static void main(String[] args)
	{
		/*
		 * to do
		 */


		Clock clock = Clock.system(ZoneId.systemDefault());
     	 System.out.println("Clock : " + clock.toString());
	}

}
