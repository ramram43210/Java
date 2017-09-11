import java.time.Clock;
import java.time.LocalTime;

public class LocalTimeDemo1
{

	public static void main(String[] args)
	{
		LocalTime time = LocalTime.now(Clock.systemUTC());
		System.out.println(time);
	}

}
