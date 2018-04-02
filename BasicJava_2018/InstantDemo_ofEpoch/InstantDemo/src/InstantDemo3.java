import java.time.Instant;

public class InstantDemo3
{
	public static void main(String[] args)
	{
		/*
		 * Obtains an instance of Instant using seconds from the epoch
		 * of 1970-01-01T00:00:00Z and nanosecond fraction of second.
		 * 
		 * Parameters:
		 * 
		 * epochSecond - the number of seconds from
		 * 1970-01-01T00:00:00Z
		 * 
		 * nanoAdjustment - the nanosecond adjustment to the number of
		 * seconds, positive or negative
		 * 
		 * Returns:
		 * 
		 * an instant, not null
		 */
		Instant instant = Instant.ofEpochSecond(90900L, 8000);
		System.out.println(instant);
	}

}
