import java.sql.Timestamp;

public class TimestampDemo1
{

	public static void main(String[] args)
	{

		long millis = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(millis);
		System.out.println(timestamp);

		/*
		 * Returns:the number of milliseconds since January 1, 1970,
		 * 00:00:00 GMT represented by this date.
		 */
		long milliseconds = timestamp.getTime();
		System.out.println(milliseconds);

	}

}
