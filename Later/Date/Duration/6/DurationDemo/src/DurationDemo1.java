import java.time.Duration;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		Duration duration = Duration.ofDays(2);
		System.out.println("duration     = "+duration);

		duration = duration.minusDays(1);
		System.out.println("Minus 1 day   = "+duration);
		
		duration = duration.minusHours(2);
		System.out.println("Minus 2 hours = "+duration);
		
		duration = duration.minusMinutes(50);
		System.out.println("Minus 50 mins = "+duration);
		
		duration = duration.minusSeconds(40);
		System.out.println("Minus 40 secs = "+duration);
		
		duration = duration.minusMillis(10);
		System.out.println("Minus 10 Millis = "+duration);
		
		duration = duration.minusNanos(70000);
		System.out.println("Minus 70000 Nanos = "+duration);

	}

}
