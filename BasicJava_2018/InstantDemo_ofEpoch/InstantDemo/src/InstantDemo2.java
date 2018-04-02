import java.time.Instant;

public class InstantDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Obtains an instance of Instant using seconds from the epoch
		 * of 1970-01-01T00:00:00Z.
		 * 
		 * Parameters:
		 * 
		 * epochSecond - the number of seconds from
		 * 1970-01-01T00:00:00Z
		 * 
		 * Returns:
		 * 
		 * an instant, not null
		 */
		Instant instant = Instant.ofEpochSecond(100000L);
		System.out.println(instant);
	}

}
