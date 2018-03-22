import java.time.Duration;

public class DurationDemo
{
	public static void main(String[] args)
	{
		/*
		 * Obtains an instance of Duration from a temporal amount.
		 * 
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
