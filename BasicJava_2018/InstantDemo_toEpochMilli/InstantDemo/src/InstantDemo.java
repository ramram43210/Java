import java.time.Instant;

public class InstantDemo
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2014-12-03T10:15:30.00Z");
		System.out.println(instant);

		/*
		 * Converts this instant to the number of milliseconds from
		 * the epoch of 1970-01-01T00:00:00Z.
		 * 
		 * Returns:the number of milliseconds since the epoch of
		 * 1970-01-01T00:00:00Z
		 */
		long ms = instant.toEpochMilli();
		System.out.println(ms);

	}

}
