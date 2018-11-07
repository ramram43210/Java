import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimestampDemo
{

	public static void main(String[] args)
	{

		long millis = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(millis);
		System.out.println(timestamp);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH.mm.ss");

		/*
		 * Parameters:
		 *
		 * date - the time value to be formatted into a time string.
		 *
		 * Returns:
		 *
		 * the formatted time string.
		 */
		String formatedStrDate = sdf.format(timestamp);
		System.out.println(formatedStrDate);

	}

}
