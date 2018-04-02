import java.time.Instant;

public class InstantDemo1
{
	public static void main(String[] args)
	{

		/*
		 * Obtains an instance of Instant using milliseconds from the
		 * epoch of 1970-01-01T00:00:00Z.
		 * 
		 * Parameters:
		 * 
		 * epochMilli - the number of milliseconds from
		 * 1970-01-01T00:00:00Z
		 * 
		 * Returns:
		 * 
		 * an instant, not null
		 */
		Instant instant = Instant.ofEpochMilli(50000L);
		System.out.println(instant);
	}

}
