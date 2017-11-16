import java.time.Duration;

public class DurationDemo1
{
	public static void main(String[] args)
	{
		Duration duration = Duration.ofDays(1);
		System.out.println("duration     = "+duration);

		duration = duration.plusDays(1);
		System.out.println("Plus 1 day   = "+duration);
		
		duration = duration.plusHours(2);
		System.out.println("Plus 2 hours = "+duration);
		
		duration = duration.plusMinutes(50);
		System.out.println("Plus 50 mins = "+duration);
		
		duration = duration.plusSeconds(40);
		System.out.println("Plus 40 secs = "+duration);
		
		duration = duration.plusMillis(10);
		System.out.println("Plus 10 Millis = "+duration);
		
		duration = duration.plusNanos(70000);
		System.out.println("Plus 70000 Nanos = "+duration);

	}

}
