import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

public class TimestampDemo
{

	public static void main(String[] args)
	{

		long millis = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(millis);
		System.out.println("timestamp = "+timestamp);

		/*
		 * Converts this Timestamp object to an Instant.
		 */
		Instant instant = timestamp.toInstant();
		System.out.println("instant = "+instant);

		/*
		 * Converts this Timestamp object to a LocalDateTime.
		 */
		LocalDateTime localDateTime = timestamp.toLocalDateTime();
		System.out.println("localDateTime = "+localDateTime);

	}

}
