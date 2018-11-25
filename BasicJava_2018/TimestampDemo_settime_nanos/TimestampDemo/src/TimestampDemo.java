import java.sql.Timestamp;

public class TimestampDemo
{

	public static void main(String[] args)
	{

		Timestamp timestamp = Timestamp.valueOf("2018-01-23 19:09:58.743");
		System.out.println(timestamp);

		long time = System.currentTimeMillis();

		/*
		 * Parameters:
		 *
		 * time - the number of milliseconds.
		 */
		timestamp.setTime(time);
		System.out.println(timestamp);

		/*
		 * Parameters:
		 *
		 * n - the new fractional seconds component
		 */
		timestamp.setNanos(3);
		System.out.println(timestamp);
	}

}
