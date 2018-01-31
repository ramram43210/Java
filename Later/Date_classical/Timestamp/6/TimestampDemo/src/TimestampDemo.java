import java.sql.Timestamp;
import java.time.Instant;

public class TimestampDemo
{

	public static void main(String[] args)
	{

		Instant instant = Instant.now();
		/*
		 * Parameters:
		 *
		 * instant - the instant to convert
		 *
		 * Returns:
		 *
		 * an Timestamp representing the same point on the time-line
		 * as the provided instant
		 */
		Timestamp timestamp = Timestamp.from(instant);
		System.out.println(timestamp);
	}

}
