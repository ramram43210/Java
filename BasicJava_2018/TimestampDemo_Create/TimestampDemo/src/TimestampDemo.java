import java.sql.Timestamp;
import java.util.Date;

public class TimestampDemo
{

	public static void main(String[] args)
	{

		// method 1
		long millis = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(millis);
		System.out.println(timestamp);

		// method 2 - via Date
		Date date = new Date();
		millis = date.getTime();
		timestamp = new Timestamp(millis);
		System.out.println(timestamp);

	}

}
