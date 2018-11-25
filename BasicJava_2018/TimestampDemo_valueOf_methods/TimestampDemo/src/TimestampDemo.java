import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TimestampDemo
{

	public static void main(String[] args)
	{

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime = " + localDateTime);

		/*
		 * Obtains an instance of Timestamp from a LocalDateTime
		 * object, with the same year, month, day of month, hours,
		 * minutes, seconds and nanos date-time value as the provided
		 * LocalDateTime
		 */
		Timestamp timestamp = Timestamp.valueOf(localDateTime);
		System.out.println(timestamp);

		/*
		 * Parameters:
		 *
		 * s - timestamp in format yyyy-[m]m-[d]d hh:mm:ss[.f...]. The
		 * fractional seconds may be omitted. The leading zero for mm
		 * and dd may also be omitted.
		 *
		 * Returns:
		 *
		 * corresponding Timestamp value
		 */
		timestamp = Timestamp.valueOf("2013-01-23 19:09:58.743");
		System.out.println(timestamp);
	}

}
