import java.time.Instant;

public class InstantDemo1
{
	public static void main(String[] args)
	{

		Instant instant = Instant.now();
		System.out.println("instant = "+instant);

		/*
		 * Returns:the seconds from the epoch of 1970-01-01T00:00:00Z
		 */
		long secondValue = instant.getEpochSecond();
		System.out.println("secondValue = "+secondValue);

		/*
		 * Returns:the nanoseconds within the second, always positive,
		 * never exceeds 999,999,999
		 */
		long nanoValue = instant.getNano();
		System.out.println("nanoValue   = "+nanoValue);
		
	}

}
