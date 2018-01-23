import java.sql.Timestamp;

public class TimestampDemo2
{

	public static void main(String[] args) throws InterruptedException
	{

		long millis = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(millis);
		System.out.println(timestamp);

		/*
		 * Gets this Timestamp object's nanos value.
		 */
		long nanoseconds = timestamp.getNanos();
		System.out.println(nanoseconds);
	}

}
