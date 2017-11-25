import java.time.Duration;

public class DurationDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * amount - the temporal amount to convert, not null
		 * 
		 * Returns:
		 * 
		 * the equivalent duration, not null
		 */
		Duration duration = Duration.from(Duration.ZERO);
		System.out.println(duration);

	}

}
