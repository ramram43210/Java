import java.time.Instant;

public class InstantDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Returns:the current instant using the system clock, not
		 * null
		 */
		Instant instant = Instant.now();
		System.out.println(instant);
	}

}
