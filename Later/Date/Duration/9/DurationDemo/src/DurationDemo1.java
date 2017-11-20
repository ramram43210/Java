import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		 Duration duration = Duration.between(LocalTime.MIDNIGHT,LocalTime.NOON);
		 
		 long secondsValue = duration.get(ChronoUnit.SECONDS);
		 System.out.println("secondsValue = "+secondsValue);
	}

}
