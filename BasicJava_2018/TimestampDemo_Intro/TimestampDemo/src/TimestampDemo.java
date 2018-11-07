import java.sql.Timestamp;

public class TimestampDemo
{
	public static void main(String[] args)
	{
		long millisecond = System.currentTimeMillis();

		/*
		 * Constructs a Timestamp object using a milliseconds time
		 * value. The integral seconds are stored in the underlying
		 * date value; the fractional seconds are stored in the nanos
		 * field of the Timestamp object.
		 *
		 * Parameters:
		 *
		 * time - milliseconds since January 1, 1970, 00:00:00 GMT. A
		 * negative number is the number of milliseconds before
		 * January 1, 1970, 00:00:00 GMT.
		 */
		Timestamp timestamp = new Timestamp(millisecond);
		System.out.println(timestamp);
	}

}
