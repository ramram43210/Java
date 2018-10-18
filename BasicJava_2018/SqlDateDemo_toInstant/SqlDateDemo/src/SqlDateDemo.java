import java.sql.Date;
import java.time.Instant;

public class SqlDateDemo
{
	public static void main(String[] args)
	{
		long millis = System.currentTimeMillis();
		java.sql.Date date = new Date(millis);
		System.out.println(date);

		/*
		 * This method always throws an UnsupportedOperationException
		 * and should not be used because SQL Date values do not have
		 * a time component.
		 */
		Instant instant = date.toInstant();
		System.out.println(instant);
	}

}
